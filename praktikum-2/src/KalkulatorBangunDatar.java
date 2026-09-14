import java.util.Scanner;

/* Nama Program : KalkulatorBangunDatar.java
*  Deskripsi    : Program ini menghitung luas dan keliling persegi panjang
*                 serta luas dan keliling lingkaran berdasarkan input pengguna.
*                 Program juga menentukan apakah luas persegi panjang tergolong
*                 besar (> 100) menggunakan variabel boolean.
*/

public class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // =========== BAGIAN 1: PERSEGI PANJANG ===========
        // Meminta input panjang bertipe double
        System.out.print("Masukkan Panjang Persegi Panjang: ");
        double panjang = sc.nextDouble();

        // Meminta input lebar bertipe double
        System.out.print("Masukkan Lebar Persegi Panjang: ");
        double lebar = sc.nextDouble();

        // Menghitung luas dan keliling persegi panjang
        double luasPersegiPanjang = panjang * lebar;
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
        System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang);

        // ========== BAGIAN 2: LINGKARAN ==========
        // Meminta input jari-jari lingkaran bertipe double
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = sc.nextDouble();

        // Menghitung luas dan keliling lingkaran menggunakan Math.PI
        double luasLingkaran = Math.PI * jariJari * jariJari;
        double kelilingLingkaran = 2 * Math.PI * jariJari;

        System.out.println("Luas Lingkaran: " + luasLingkaran);
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);

        // =========== BAGIAN 3: CEK LUAS BESAR ==========
        // Menyimpan status apakah luas persegi panjang tergolong besar (> 100)
        boolean luasBesar = luasPersegiPanjang > 100;
        System.out.print("Luas Besar (>100): " + luasBesar);

        sc.close();
    }
}
