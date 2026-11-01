public class Latihan3 {
    public static void main(String[] args) {
        Waktu w = new Waktu(10, 30,45);
        System.out.println("Waktu awal:");
        System.out.println(
                w.getJam() + ":" +
                w.getMenit() + ":" +
                w.getDetik()
        );

        // Mengubah waktu dengan nilai valid
        System.out.println("\n--- Ubah dengan nilai valid ---");
        w.setJam(23);
        w.setMenit(59);
        w.setDetik(0);

        System.out.println("Setelah Diubah:");
        System.out.println(
                w.getJam() + ":" +
                w.getMenit() + ":" +
                w.getDetik()
        );

        // Menguji nilai tidak valid
        System.out.println("\n--- Ubah dengan nilai tidak valid ---");
        w.setJam(25);
        w.setMenit(60);
        w.setDetik(-5);

        System.out.println("\nSetelah Pengujian:");
        System.out.println(
                w.getJam() + ":" +
                w.getMenit() + ":" +
                w.getDetik()
        );
    }
}
