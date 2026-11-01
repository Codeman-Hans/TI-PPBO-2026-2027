public class Latihan2 {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Java","Budi Santoso",2024);

        System.out.println("Data Buku Sebelum Diubah:");
        System.out.println("Judul        : " + buku1.getJudul());
        System.out.println("Pengarang    : " + buku1.getPengarang());
        System.out.println("Tahun Terbit : " + buku1.getTahunTerbit());

        buku1.setJudul("Belajar Java OOP");
        buku1.setPengarang("Andi Saputra");

        System.out.println("\nData Buku Setelah Diubah:");
        System.out.println("Judul        : " + buku1.getJudul());
        System.out.println("Pengarang    : " + buku1.getPengarang());
        System.out.println("Tahun Terbit : " + buku1.getTahunTerbit());
    }
}
