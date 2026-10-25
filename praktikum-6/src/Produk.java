public class Produk {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    // Construktor untuk tugas
    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // Construktor untuk latihan 3
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.kodeProduk = "-";
        this.stok = 0;
    }

    // latihan 3: Memeriksa apakah produk mahal
    boolean isMahal(double batasHarga) {
        return harga > batasHarga;
    }

    // Tugas: Menghitung total harga pembelian
    double hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }

    // Tugas: Mengurangi stok produk
    boolean kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah pembelian harus lebih dari 0");
            return false;
        } else if (jumlah <= stok) {
            stok -= jumlah;
            return true;
        } else {
            System.out.println("Stok tidak mencukupi! Stok tersedia: " + stok);
            return false;
        }
    }

    void tampilkanData() {
        System.out.println(kodeProduk + " | " + namaProduk + " | Rp" + harga + " | stok : " + stok);
    }
}
