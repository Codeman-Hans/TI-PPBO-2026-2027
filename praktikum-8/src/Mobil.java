public class Mobil extends Kendaraan {
    protected int jumlahPintu;

    public Mobil(String merek, double kecepatanMaks, int jumlahPintu) {
        super(merek, kecepatanMaks);
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilkanInfo() {
        System.out.println("Merek          : " + merek);
        System.out.println("Kecepatan Maks : " + kecepatanMaks + "km/jam");
    }
}
