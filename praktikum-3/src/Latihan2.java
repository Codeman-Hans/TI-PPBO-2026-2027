import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Memasukkan bilangan bulat 1 sampai 3
        System.out.print("Masukkan bilangan pertama: ");
        int a = sc.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int b = sc.nextInt();

        System.out.print("Masukkan bilangan ketiga: ");
        int c = sc.nextInt();

        // Mengecek kondisi yang mana bilangan terbesar diantara ke tiganya
        int terbesar;
        if (a >= b && a >= c) {
            terbesar = a;
        } else if (b >= a && b >= c) {
            terbesar = b;
        } else {
            terbesar = c;
        }

        System.out.println("Bilangan terbesar adalah: " + terbesar);
    }
}
