public class Latihan5 {
    public static void main(String[] args) {
        Produk produk1 = new Produk("P001","Keyboard",150000, 10);

        System.out.println("=== DATA PRODUK ===");
        System.out.println("Kode : " + produk1.getKodeProduk());
        System.out.println("Nama : " + produk1.getNamaProduk());
        System.out.println("Harga: " + produk1.getHarga());
        System.out.println("Stok : " + produk1.getStok());

        // Mengubah Harga
        System.out.println("\n=== UJI HARGA ===");
        produk1.setHarga(175000);
        produk1.setHarga(-5000);

        // Menambah stok
        System.out.println("\n=== UJI TAMBAH STOK ===");
        produk1.tambahStok(5);
        produk1.tambahStok(-3);

        // Mengurangi stok
        System.out.println("\n=== UJI KURANGI STOK ===");
        produk1.kurangiStok(3);
        produk1.kurangiStok(50);
        produk1.kurangiStok(-2);

        // Menampilkan stok akhir
        System.out.println("\n=== DATA AKHIR ===");
        System.out.println("Harga: " + produk1.getHarga());
        System.out.println("Stok : " + produk1.getStok());
    }
}
