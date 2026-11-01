public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    // Construktor
    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;

        setHarga(harga);

        if (stok >= 0) {
            this.stok = stok;
        } else {
            this.stok = 0;
        }
    }

    // Getter kode produk
    public String getKodeProduk() {
        return kodeProduk;
    }

    // Getter nama produk
    public String getNamaProduk() {
        return namaProduk;
    }

    // Getter harga
    public double getHarga() {
        return harga;
    }

    // Getter stok
    public int getStok() {
        return stok;
    }

    // Setter harga dengan validasi
    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak boleh negatif");
        }
    }

    // Menambah stok
    public void tambahStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tambah stok harus positif");
        } else {
            stok += jumlah;
            System.out.println("Stok berhasil ditambahkan");
        }
    }

    // Mengurangi stok
    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah pengurangan harus positif");
        } else if (jumlah > stok) {
            System.out.println("Stok tidak mencukupi");
        } else {
            stok -= jumlah;
            System.out.println("Stok berhasil dikurangi");
        }
    }
}
