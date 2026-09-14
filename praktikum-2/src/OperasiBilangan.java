import java.util.Scanner;

public class OperasiBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Bilangan Pertama: ");
        int bil1 = sc.nextInt();

        System.out.print("Masukkan Bilangan kedua: ");
        int bil2 = sc.nextInt();

        // Operasi Aritmatika
        System.out.println("Jumlah: " + (bil1 + bil2));
        System.out.println("Selisih: " + (bil1 - bil2));
        System.out.println("Kali: " + (bil1 * bil2));
        System.out.println("Bagi: " + (bil1 / bil2));
        System.out.println("Selisih Bagi: " + (bil1 % bil2));

        // Operasi Relational
        System.out.println("Lebih Besar (>): " + (bil1 > bil2));
        System.out.println("Lebih Kecil (<): " + (bil1 < bil2));
        System.out.println("Sama Dengan (==): " + (bil1 == bil2));
    }
}
