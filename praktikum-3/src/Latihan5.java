import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membaca berat badan (kg) dan tinggi badan (meter)
        System.out.print("Masukkan berat badan anda (kg): ");
        double berat = sc.nextDouble();

        System.out.print("Masukkan tinggi badan anda (meter): ");
        double tinggi = sc.nextDouble();

        // Menghitung BMI dengan rumus berat / (tinggi * tinggi)
        double bmi = berat / (tinggi * tinggi);

        System.out.println("BMI anda: " + bmi);

        // Menentukan kategori BMI menggunakan if-else bertingkat
        /* Urutan kondisi disusun dari yang paling
        ketat/terendah ke tertinggi */
        String kategori;
        if (bmi < 18.5) {
            kategori = "Kurus";
        } else if (bmi < 25) {
            kategori = "Normal";
        } else if (bmi < 30) {
            kategori = "Gemuk";
        } else {
            kategori = "Obesitas";
        }

        System.out.println("kategori: " + kategori);
    }
}
