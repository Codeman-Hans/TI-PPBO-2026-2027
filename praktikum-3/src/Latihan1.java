import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membaca sebuah bilangan bulat dari masukan user
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int bilangan = sc.nextInt();

        // Memeriksa sisa bagi dengan 2 untuk menentukan ganjil atau genap
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan Genap");
        } else {
            System.out.println(bilangan + " adalah bilangan Ganjil");
        }
    }
}
