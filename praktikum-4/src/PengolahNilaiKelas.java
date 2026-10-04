import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // KKM (kriteria ketuntasan Minimal) sebagai variabel di awal program
        final int KKM = 70;

        // === a) Membaca jumlah mahasiswa dan nilai ujian masing-masing ===
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        // === b) Menghitung rata-rata, tertinggi, terendah, lulus, tidak lulus ===
        int total = 0;
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < n; i++) {
            total += nilai[i];

            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }

            if (nilai[i] >= KKM) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        double rataRata = (double) total / n;

        // === c) Mengurutkan array nilai secara ascending menggunakan bubble sort manual ===
        // Menyimpan salinan array asli (sebelum diurutkan) untuk ditampilkan nanti
        int[] nilaiSebelum = new int[n];
        for (int i = 0; i < n; i++) {
            nilaiSebelum[i] = nilai[i];
        }

        // Bubble sort: bandingkan elemen bersebelahan, tukar jika salah urutan
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int tempt = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = tempt;
                }
            }
        }

        // === d) Menampilkan seluruh hasil dalam format laporan yang rapi ===
        System.out.println();
        System.out.println("========== LAPORAN PENGOLAHAN NILAI KELAS ==========");
        System.out.println("Jumlah Mahasiswa : " + n);
        System.out.println("KKM              : " + KKM);
        System.out.println();

        System.out.println("= MENAMPILKAN NILAI SEBELUM DAN SESUDAH DIURUTKAN =");
        System.out.print("Nilai Sebelum Diurutkan: ");
        for (int n1 : nilaiSebelum) {
            System.out.print(n1 + " ");
        }
        System.out.println();

        System.out.print("Nilai Sesudah Diurutkan: ");
        for (int n1 : nilai) {
            System.out.print(n1 + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("= MENAMPILKAN HASIL HITUNG SEMUANYA =");
        System.out.println("Rata-rata Kelas    : " + rataRata);
        System.out.println("Nilai Tertinggi    : " + tertinggi);
        System.out.println("Nilai Terendah     : " + terendah);
        System.out.println("Jumlah Lulus       : " + jumlahLulus + " Mahasiswa");
        System.out.println("Jumlah Tidak Lulus : " + jumlahTidakLulus + " Mahasiswa");
    }
}