public class Latihan3 {
    public static void main(String[] args) {
        Produk produk1 = new Produk("Mouse", 75000);
        Produk produk2 = new Produk("Keyboard", 250000);
        Produk produk3 = new Produk("Monitor", 1500000);

        double batasHarga = 200000;

        System.out.println(produk1.namaProduk + " mahal? " + produk1.isMahal(batasHarga));

        System.out.println(produk2.namaProduk + " mahal? " + produk2.isMahal(batasHarga));

        System.out.println(produk3.namaProduk + " mahal? " + produk3.isMahal(batasHarga));

    }
}
