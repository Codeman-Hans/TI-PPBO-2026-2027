public class VariabelDemo {
    public static void main(String[] args) {
        int nilaiBulat = 9;
        double nilaiDouble = nilaiBulat; // wildening otomatis
        System.out.println("Wildening: " + nilaiDouble);

        double pecahan = 9.8;
        int hasilCasting = (int) pecahan; // narrowing eksplisit
        System.out.println("Narrowing: " + hasilCasting);
    }
}