public class Latihan1 {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Java", "Budi Santoso",2024);

        System.out.println("Judul Buku   : " + buku1.getJudul());
        System.out.println("Pengarang    : " + buku1.getPengarang());
        System.out.println("Tahun Terbit : " + buku1.getTahunTerbit());
    }
}
