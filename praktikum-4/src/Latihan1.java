import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // membaca bilangan yang akan di buat tabel perkaliannya
        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt();

        // mencetak tabel perkalian 1 sampai 10 menggunakan for loop
        System.out.println("Tabel perkalian " + bilangan + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(bilangan + " x " + i + " = " + (bilangan * i));
        }
    }
}
