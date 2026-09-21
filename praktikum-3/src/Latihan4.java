import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membaca umur pengguna]
        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();

        // Membaca status mahasiswa (true atau false)
        System.out.print("Apakah anda mahasiswa? true/false: ");
        boolean mahasiswa = sc.nextBoolean();

        double hargaTiket;

        /* Menentukan harga tiket berdasarkan
        gabungan status mahasiswa DAN umur */
        if (mahasiswa && umur < 25) {
            hargaTiket = 25000; // harga khusus
        } else if (mahasiswa || umur < 12) {
            hargaTiket = 35000; // harga mahasiswa umum dan anak-anak
        } else {
            hargaTiket = 50000; // harga normal
        }
        System.out.println("Harga Tiket Anda: Rp" + hargaTiket);
    }
}
