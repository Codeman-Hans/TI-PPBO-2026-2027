import java.util.Scanner;

public class Latihan4 {
    // Method mencari nilai minimum dalam array
    static int cariNilaiMinimum(int[] data) {
        int min = data[0];
        for (int nilai : data) {
            if (nilai < min) {
                min = nilai;
            }
        }
        return min;
    }

    // Method mencari nilai maksimum dalam array
    static int cariNilaiMaksimum(int[] data) {
        int max = data[0];
        for (int nilai : data) {
            if (nilai > max) {
                max = nilai;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membaca array nilai ujian dari input pengguna
        System.out.print("Masukkan jumlah data nilai ujian: ");
        int n = sc.nextInt();
        int[] nilaiUjian = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilaiUjian[i] = sc.nextInt();
        }

        // Menguji kedua method dengan array yang sama
        System.out.println("Nilai Minimum: " + cariNilaiMinimum(nilaiUjian));
        System.out.println("Nilai Maksimum: " + cariNilaiMaksimum(nilaiUjian));
    }
}
