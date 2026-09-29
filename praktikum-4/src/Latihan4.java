import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriks = new int[3][3];

        /* Membaca matriks 3x3
        dari input pengguna mengggunakan nested loop */
        System.out.println("Masukkan elemen matriks 3x3:");
        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 3; kolom++) {
                System.out.print("Elemen [" + baris + "][" + kolom + "]: ");
                matriks[baris][kolom] = sc.nextInt();
            }
        }

        /* Menghitung jumlah tiap baris
        dan total keseluruhan elemen */
        int totalSemua = 0;
        for (int baris = 0; baris < 3; baris++) {
            int jumlahBaris = 0;
            for (int kolom = 0; kolom < 3; kolom++) {
                jumlahBaris += matriks[baris][kolom];
            }
            System.out.println("Jumlah baris " + baris + ": " + jumlahBaris);
            totalSemua += jumlahBaris;
        }

        System.out.println("Total seluruh elemen matriks: " + totalSemua);
    }
}
