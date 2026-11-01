public class Latihan4 {
    public static void main(String[] args) {
        Siswa siswa1 = new Siswa(85);

        System.out.println("Nilai Siswa: " + siswa1.getNilai());
        System.out.println("Nilai Huruf: " + siswa1.getNilaiHuruf());

        // Mengubah nilai
        siswa1.setNilai(75);

        System.out.println("\nSetelah Nilai Diubah:");
        System.out.println("Nilai Siswa: " + siswa1.getNilai());
        System.out.println("Nilai Huruf: " + siswa1.getNilaiHuruf());

        // Menguji nilai tidak valid
        siswa1.setNilai(150);

        System.out.println("\nSetelah Pengujian:");
        System.out.println("Nilai Siswa: " + siswa1.getNilai());
        System.out.println("Nilai Huruf: " + siswa1.getNilaiHuruf());
    }
}
