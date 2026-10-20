public class Latihan4 {
    public static void main(String[] args) {
        Buku[] daftarBuku = {
                new Buku("Laskar Pelangi", "Andrea Hirata", 2005),
                new Buku("Bumi", "Tere Liye", 2014),
                new Buku("Hujan", "Tere Liye", 2016),
                new Buku("Pulang", "Tere Liye", 2015),
                new Buku("Pergi", "Tere Liye", 2018)
        };

        System.out.println("Buku yang terbit setelah 2025");

        for (Buku buku : daftarBuku) {
            if (buku.tahunTerbit > 2015) {
                System.out.println(buku.judul + " - " + buku.tahunTerbit);
            }
        }
    }
}
