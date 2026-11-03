public class Latihan1 {
    public static void main(String[] args) {
        Kucing kcl = new Kucing();
        kcl.nama = "Boy";
        System.out.print(kcl.nama + " bersuara: ");
        kcl.bersuara();

        Anjing ajn = new Anjing();
        ajn.nama = "Pik";
        System.out.print(ajn.nama + " bersuara: ");
        ajn.bersuara();
    }
}
