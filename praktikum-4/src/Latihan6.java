import java.util.Scanner;

public class Latihan6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Membaca ukuran array dan isinya dari pengguna
            System.out.print("Masukkan jumlah elemen array: ");
            int n = sc.nextInt();
            int[] angka = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
                angka[i] = sc.nextInt();
            }

            // Menampilkan array sebelum diurutkan
            System.out.print("Array sebelum diurutkan: ");
            for (int nilai : angka) {
                System.out.print(nilai + " ");
            }
            System.out.println();

            // Bubble sort manual: bandingkan elemen bersebelahan, tukar jika salah urutan
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (angka[j] > angka[j + 1]) {
                        // Tukar posisi menggunakan variabel sementara (temp)
                        int temp = angka[j];
                        angka[j] = angka[j + 1];
                        angka[j + 1] = temp;
                    }
                }
            }

            // Menampilkan array setelah diurutkan
            System.out.print("Array setelah diurutkan: ");
            for (int nilai : angka) {
                System.out.print(nilai + " ");
            }
            System.out.println();
            }
        }