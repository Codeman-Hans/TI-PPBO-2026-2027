public class Latihan5 {
    public static void main(String[] args) {
        Persegi[] daftarPersegi = {
            new Persegi(3),
            new Persegi(7),
            new Persegi(5),
            new Persegi(10)
        };

        Persegi terbesar = daftarPersegi[0];

        for (Persegi persegi : daftarPersegi) {
            if (persegi.hitungLuas() > terbesar.hitungLuas()) {
                terbesar = persegi;
           }
        }

        System.out.println("Persegi dengan luas terbesar:");
        System.out.println("Sisi: " + terbesar.sisi);
        System.out.println("Luas: " + terbesar.hitungLuas());
        System.out.println("Keliling: " + terbesar.hitungKeliling());
    }
}
