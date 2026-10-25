public class Produk {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    double hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }

    void kurangiStok(int jumlah) {
        if (jumlah > stok) {
            System.out.println("Stok tidak mencukupi! Stok tersedia: " + stok);
        } else {
            stok -= jumlah;
            System.out.println("Pembelian berhasil. Sisa stok: " + stok);
        }
    }

    void tampilkanData() {
        System.out.println(kodeProduk + " | " + namaProduk + " | Rp" + harga + " | stok : " + stok);
    }
}
