import java.util.Arrays;
import java.util.Scanner;

/**
 * Tugas Praktikum 5 - Method dan Fungsi
 * Program Kalkulator berbasis menu dengan seluruh operasi dibuat sebagai
 * method static terpisah (menerima parameter dan mengembalikan hasil).
 *
 * Fitur:
 * - Operasi: tambah (2 dan 3 angka), kurang, kali, bagi, pangkat, akar kuadrat
 * - Menu berulang sampai pengguna memilih keluar
 * - Method overloading pada tambah()
 * - Riwayat hasil disimpan dalam array, nilai maksimumnya ditampilkan saat keluar
 */

public class KalkulatorMethod {

    // =====================================================================
    // BAGIAN 1 - METHOD OPERASI (Semua mengembalikan hasil, tidak mencetak)
    // =====================================================================

    // Overloading versi 1: Menjumlahkan 2 angka
    static double tambah(double a, double b) {
        return a + b;
    }

    // Overloading versi 2: Menjumlahkan 3 angka (jumlah parameter berbeda)
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    static double kurang(double a, double b) {
        return a - b;
    }

    static double kali(double a, double b) {
        return a * b;
    }

    // Catatan: pengecekan pembagi = 0 dilakukan di main sebelum method ini dipanggil
    static double bagi(double a, double b) {
        return a / b;
    }

    static double pangkat(double basis, double eksponen) {
        return Math.pow(basis, eksponen);
    }

    // Catatan: pengecekan angka negatif dilakukan di main sebelum method ini dipanggil
    static double akarKuadrat(double x) {
        return Math.sqrt(x);
    }

    // ===================================================================
    // BAGIAN 2 - METHOD ARRAY
    // ===================================================================

    /**
    * Menerima array berisi seluruh hasil perhitungan dan mengembalikan nilai terbesar di dalamnya.
    * Array yang dikirim harus hanya berisi data yang benar-benar terisi, supaya slot kosong (bernilai 0.0) tidak ikut dibandingkan.
     */
    static double riwayatKeMaksimum(double[] riwayatHasil) {
        double max = riwayatHasil[0]; // mulai dari elemen pertama, bukan 0
        for (double nilai : riwayatHasil) {
            if (nilai > max) {
                max = nilai;
            }
        }

        return max;
    }

    // ===================================================================
    // BAGIAN 3 - METHOD TAMPILAN
    // ===================================================================

    static void tampilkanMenu() {
        System.out.println();
        System.out.println("========== KALKULATOR METHOD ==========");
        System.out.println(" 1. Tambah (2 angka)");
        System.out.println(" 2. Tambah (3 angka)");
        System.out.println(" 3. Kurang");
        System.out.println(" 4. Kali");
        System.out.println(" 5. Bagi");
        System.out.println(" 6. Pangkat");
        System.out.println(" 7. Akar Kuadrat");
        System.out.println(" 8. Keluar");
    }

    // ====================================================================
    // BAGIAN 4 - PROGRAM UTAMA
    // ====================================================================

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] riwayat = new double[10]; // Menyimpan seluruh hasil perhitungan
        int jumlahRiwayat = 0;
        boolean berjalan = true;

        while (berjalan) {
            tampilkanMenu();
            System.out.print("Pilih menu: ");
            String pilihan = sc.nextLine().trim();

            // Opsi keluar: tampilkan nilai maksimum dari riwayat lalu hentikan loop
            if (pilihan.equals("8")) {
                if (jumlahRiwayat > 0) {
                    // Kirim hanya bagian array yang terisi agar slot kosong tidak ikut dihitung
                    double[] terisi = Arrays.copyOf(riwayat, jumlahRiwayat);
                    System.out.println("Jumlah perhitungan  : " + jumlahRiwayat);
                    System.out.println("Hasil terbesar      : " + riwayatKeMaksimum(terisi));
                } else {
                    System.out.println("Belum ada perhitungan yang dilakukan.");
                }
                System.out.println("Terima kasih, program selesai.");
                berjalan = false;
                continue;
            }

            // Tentukan berapa angka yang harus diinput untuk menu yang dipilih
            int jumlahOperand;
            switch (pilihan) {
                case "1": case "3": case "4": case "5": case "6":
                    jumlahOperand = 2;
                    break;
                case "2":
                    jumlahOperand = 3;
                    break;
                case "7":
                    jumlahOperand = 1;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
                    continue;
            }

            // Baca angka dari pengguna; ulangi sampai input berupa angka yang valid
            double[] angka = new double[jumlahOperand];
            for (int i = 0; i < jumlahOperand; i++) {
                boolean valid = false;
                while (!valid) {
                    System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
                    String masukan = sc.nextLine().trim().replace(',', '.');
                    try {
                        double nilai = Double.parseDouble(masukan);
                        if (Double.isFinite(nilai)) {
                            angka[i] = nilai;
                            valid = true;
                        } else {
                            System.out.println("Input harus berupa angka biasa.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Input tidak valid, masukkan angka.");
                    }
                }
            }

            // Panggil method sesuai pilihan; hasil ditampung di variabel
            double hasil = 0;
            boolean berhasil = true;
            String ekspresi = "";

            switch (pilihan) {
                case "1":
                    hasil = tambah(angka[0], angka[1]);
                    ekspresi = angka[0] + " + " + angka[1];
                    break;
                case "2":
                    hasil = tambah(angka[0], angka[1], angka[2]);
                    ekspresi = angka[0] + " + " + angka[1] + " + " + angka[2];
                    break;
                case "3":
                    hasil = kurang(angka[0], angka[1]);
                    ekspresi = angka[0] + " - " + angka[1];
                    break;
                case "4":
                    hasil = kali(angka[0], angka[1]);
                    ekspresi = angka[0] + " x " + angka[1];
                    break;
                case "5":
                    if (angka[1] == 0) {
                        System.out.println("Error: pembagian dengan nol tidak diperbolehkan.");
                        berhasil = false;
                    } else {
                        hasil = bagi(angka[0], angka[1]);
                        ekspresi = angka[0] + " / " + angka[1];
                    }
                    break;
                case "6":
                    hasil = pangkat(angka[0], angka[1]);
                    ekspresi = angka[0] + " ^ " + angka[1];
                    break;
                case "7":
                    if (angka[0] < 0) {
                        System.out.println("Error: akar kuadrat dari bilangan negatif tidak didefinisikan.");
                        berhasil = false;
                    } else {
                        hasil = akarKuadrat(angka[0]);
                        ekspresi = "akar(" + angka[0] + ")";
                    }
                    break;
            }

            // Hasil pangkat bisa tidak didefinisikan (NaN) atau terlalu besar (Infinity)
            if (berhasil && !Double.isFinite(hasil)) {
                System.out.println("Error: hasil tidak terdefinisi atau terlalu besar.");
                berhasil = false;
            }

            // Tampilkan hasil dan simpan ke riwayat
            if (berhasil) {
                System.out.println("Hasil: " + ekspresi + " = " + hasil);

                // Jika array riwayat penuh, perbesar dua kali lipat
                if (jumlahRiwayat == riwayat.length) {
                    riwayat = Arrays.copyOf(riwayat, riwayat.length * 2);
                }
                riwayat[jumlahRiwayat] = hasil;
                jumlahRiwayat++;
            }
        }

        sc.close();
    }
}