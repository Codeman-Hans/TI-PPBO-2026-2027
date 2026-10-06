public class Latihan1 {
    // Method menghitung luas persegi panjang, mengembalikan nilai double
    static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    // method menghitung luas lingkaran, mengembalikan nilai double
    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        // Memanggil method dengan beberapa nilai input berbeda
        System.out.println("Luas Persegi Panjang (5 x 3): " + luasPersegiPanjang(5, 3));
        System.out.println("Luas Persegi Panjang (10 x 4): " + luasPersegiPanjang(10,4));

        System.out.println("Luas Lingkaran (r=7): " + luasLingkaran(7));
        System.out.println("Luas Lingkaran (r=10): " + luasLingkaran(10));
    }
}
