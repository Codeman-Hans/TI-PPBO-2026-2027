public class TokoDemo {
    public static void main(String[] args) {

        // Membuat array of object berisi 5 produk
        Produk[] daftarProduk = new Produk[5];

        daftarProduk[0] = new Produk("P001", "Laptop", 8000000, 5);
        daftarProduk[1] = new Produk("P002", "Mouse", 50000, 20);
        daftarProduk[2] = new Produk("P003", "Keyboard", 150000, 15);
        daftarProduk[3] = new Produk("P004", "Monitor", 2000000, 3);
        daftarProduk[4] = new Produk("P005", "Headset", 300000, 10);

        // Menampilkan seluruh produk
        System.out.println("=== Daftar Semua Produk ===");
        for (Produk p : daftarProduk) {
            p.tampilkanData();
        }

        // Simulasi pembelian pertama: berhasil
        System.out.println("\n=== Simulasi Pembelian 1 (berhasil) ===");
        Produk produk1 = daftarProduk[1];
        int jumlahBeli1 = 5;
        System.out.println("Nama Produk : " + produk1.namaProduk);
        System.out.println("Jumlah Beli : " + jumlahBeli1);

        if (produk1.kurangiStok(jumlahBeli1)) {
            System.out.printf("Total Harga : Rp%.0f%n", produk1.hitungTotalHarga(jumlahBeli1));
            System.out.println("Pembelian berhasil.");
        } else {
            System.out.println("Pembelian gagal.");
        }

        System.out.println("Sisa Stok   : " + produk1.stok);

        // Simulasi pembelian kedua: stok tidak mencukupi
        System.out.println("\n=== Simulasi Pembelian 2 (stok tidak cukup) ===");

        Produk produk2 = daftarProduk[3];
        int jumlahBeli2 = 10;

        System.out.println("Nama Produk : " + produk2.namaProduk);
        System.out.println("Jumlah Beli : " + jumlahBeli2);

        if (jumlahBeli2 > 0 && jumlahBeli2 <= produk2.stok) {
            System.out.printf("Total Harga : Rp%.0f%n", produk2.hitungTotalHarga(jumlahBeli2));

            produk2.kurangiStok(jumlahBeli2);
            System.out.println("Pembelian berhasil");
        } else {
            produk2.kurangiStok(jumlahBeli2);
            System.out.println("Pembelian gagal.");
        }

        System.out.println("Sisa stok   : " + produk2.stok);

        // Mencari produk dengan harga termahal
        System.out.println("\n=== Mencari Produk Termahal ===");
        Produk termahal = daftarProduk[0];
        for (Produk p : daftarProduk) {
            if (p.harga > termahal.harga) {
                termahal = p;
            }
        }

        System.out.println("Produk termahal:");
        termahal.tampilkanData();
    }
}
