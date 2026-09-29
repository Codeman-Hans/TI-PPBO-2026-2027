import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membaca ukuran/tinggi pola dari pengguna
        System.out.print("Masukkan ukuran pola: ");
        int ukuran = sc.nextInt();

        // === POLA SEGITIGA TERBALIK ===
        // Baris pertama paling panjang,
        // strip baris berikutnya berkurang satu bintang
        System.out.println("Pola Segitiga Terbalik:");
        for (int i = ukuran; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // === POLA PERSEGI ===
        // Setiap baris memiliki jumlah bintang yang sama
        // (sebanyak ukuran)
        System.out.println("Pola persegi:");
        for (int i = 1; i <= ukuran; i++) {
            for (int j = 1; j <= ukuran; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}