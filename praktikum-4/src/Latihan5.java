import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membaca ukuran array dan isinya dari pengguna
        System.out.print("Masukkan jumlah elemen array:");
        int n = sc.nextInt();
        int[] angka = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }

        // Langkah 1: cari nilai terbesar (max) terlebh dahulu
        int terbesar = angka[0];
        for (int i = 1; i < n; i++) {
            if (angka[i] > terbesar) {
                terbesar = angka[i];
            }
        }

        /* Langkah 2: cari nilai terbesar kedua, yaitu nilai terbesar
        di antara semua elemen yang LEBIH KECIL dari terbesar */
        int terbesarKedua = Integer.MIN_VALUE;
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (angka[i] < terbesar && angka[i] > terbesarKedua) {
                terbesarKedua = angka[i];
                ditemukan = true;
            }
        }

        System.out.println("Nilai terbesar: " + terbesar);
        if (ditemukan) {
            System.out.println("Nilai terbesar kedua: " + terbesarKedua);
        } else {
            System.out.println("Tidak ada nilai terbesar kedua (semua elemen sama)");
        }
    }
}
