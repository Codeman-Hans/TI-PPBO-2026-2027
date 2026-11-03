public class TugasDemo {
    public static void main(String[] args) {
        Manager mgr = new Manager("Budi","M001",8000000,2000000);
        Staff sa = new Staff("Hans","H001",5000000,1000000);
        Direktur dr = new Direktur("Alpha","A001",9000000,4000000, 6000000);

        System.out.println("\n=== MANAGER ===");
        mgr.tampilkanData();
        System.out.println("Tunjangan Jabatan : " + mgr.getTunjanganJabatan());

        System.out.println("\n=== STAFF ===");
        sa.tampilkanData();
        System.out.println("Tunjangan Kinerja : " + sa.getTunjanganKinerja());

        System.out.println("\n=== DIREKTUR ===");
        dr.tampilkanData(); // Diwariskan lewat 2 tingkat
        System.out.println("Tunjangan Jabatan : " + mgr.getTunjanganJabatan());
        System.out.println("Tunjangan Saham   : " + dr.getTunjanganSaham());

        System.out.println("\n=== Uji Gaji Negatif ===");
        Staff saError = new Staff("Doni","H002",-3000000,500000);
        saError.tampilkanData();
    }
 }
