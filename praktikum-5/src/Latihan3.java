public class Latihan3 {

    // Overload 1: Konversi Celcius ke Fahrenheit (default)
    static double konversiSuhu(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    // Overload 2: Konversi Celcius ke kelvin atau Fahrenheit sesuai parameter kedua
    static double konversiSuhu(double celsius, String skalaTujuan) {
        if (skalaTujuan.equalsIgnoreCase("Kelvin")) {
            return celsius + 273.15;
        } else if (skalaTujuan.equalsIgnoreCase("Fahrenheit")) {
            return celsius * 9 / 5 + 32;
        } else {
            System.out.println("Skala tidak dikenali, mengembalikan 0");
            return 0;
        }
    }

    public static void main(String[] args) {
        // Memanggil versi 1 parameter (otomatis ke Fahrenheit)
        System.out.println("30 Celsius ke Fahrenheit: " + konversiSuhu(30));

        // Memanggil versi 2 parameter dengan skala tujuan berbeda
        System.out.println("30 Celsius ke Kelvin: " + konversiSuhu(30, "Kelvin"));
        System.out.println("30 Celsius ke Fahrenheit: " + konversiSuhu(30, "Fahrenheit"));
    }
}
