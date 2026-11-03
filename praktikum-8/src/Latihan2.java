public class Latihan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil("Toyota",180,4);
        System.out.println("======== Mobil ========");
        m.tampilkanInfo();
        System.out.println("Jumlah Pintu   : " + m.jumlahPintu);

        System.out.println();

        Motor mt = new Motor("Yahama",150,"Matic");
        System.out.println("======== Motor ========");
        System.out.println("Merek          : " + mt.merek);
        System.out.println("Kecepatan Maks : " + mt.kecepatanMaks + "km/jam");
        System.out.println("Jenis Motor    : " + mt.jenisMotor);
    }
}
