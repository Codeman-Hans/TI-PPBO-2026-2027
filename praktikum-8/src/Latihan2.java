public class Latihan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.merek = "Toyota";
        m.kecepatanMaks = 180;
        m.jumlahPintu = 4;
        System.out.println("======== Mobil ========");
        System.out.println("Merek          : " + m.merek);
        System.out.println("Kecepatan Maks : " + m.kecepatanMaks + "km/jam");
        System.out.println("Jumlah Pintu   : " + m.jumlahPintu);

        System.out.println();

        Motor mt = new Motor();
        mt.merek = "Yamaha";
        mt.kecepatanMaks = 150;
        mt.jenisMotor = "Matic";
        System.out.println("======== Motor ========");
        System.out.println("Merek          : " + mt.merek);
        System.out.println("Kecepatan Maks : " + mt.kecepatanMaks + "km/jam");
        System.out.println("Jenis Motor    : " + mt.jenisMotor);
    }
}
