import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== Konstanta tarif per kWh untuk setiap golongan daya =====
        final double TARIF_450 = 415.0;
        final double TARIF_900 = 605.0;
        final double TARIF_1300 = 1352.0;
        final double TARIF_2200 = 1445.0;
        final double TARIF_DI_ATAS_2200 = 1699.0;

        // ===== Membaca input golongan daya listrik =====
        System.out.println("=== HITUNG TARIF LISTRIK ===");
        System.out.println("Pilihan golongan daya: 450, 900, 1300, 2200, atau di atas 2200");
        System.out.print("Masukkan golongan daya (VA): ");
        int golongan = sc.nextInt();

        // ===== Membaca input jumlah pemakaian listrik (kWh) =====
        System.out.print("Masukkan jumlah pemakaian (kWh): ");
        double kwh = sc.nextDouble();

        // ===== Validasi input kWh menggunakan operator logika =====
        // Program menolak dan menampilkan pesan error jika kWh negatif atau nol
        if (kwh < 0 || kwh == 0) {
            System.out.println("ERROR: Jumlah pemakaian (kWh) harus lebih dari 0!");
        } else {
            // ===== Menentukan tarif per kWh berdasarkan golongan daya =====
            double tarifPerKwh;
            switch(golongan) {
                case 450:
                    tarifPerKwh = TARIF_450;
                    break;
                case 900:
                    tarifPerKwh = TARIF_900;
                    break;
                case 1300:
                    tarifPerKwh = TARIF_1300;
                    break;
                case 2200:
                    tarifPerKwh = TARIF_2200;
                    break;
                default:
                    // Golongan di atas 2200 VA
                    tarifPerKwh = TARIF_DI_ATAS_2200;
            }

            // ===== Menghitung total tagihan =====
            double totalTagihan = kwh * tarifPerKwh;

            // ====== Menampilkan hasil akhir dengan format yang rapi =====
            System.out.println();
            System.out.println("===== RINCIAN TAGIHAN LISTRIK =====");
            System.out.println("Golongan Daya    : " + golongan + " VA");
            System.out.println("Jumlah Pemakaian : " + kwh + " kwh");
            System.out.println("Tarif per kwh    : Rp" + tarifPerKwh);
            System.out.println("Total Tagihan    : Rp" + totalTagihan);
        }
    }
}
