import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan Suhu Celcius: ");
        double Celcius = sc.nextDouble();

        double Fahrenheit = Celcius * 9/5 + 32;

        System.out.println(Celcius + " Celcius = " + Fahrenheit  + " Fahrenheit");
    }
}
