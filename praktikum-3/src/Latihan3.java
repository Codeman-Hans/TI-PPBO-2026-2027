import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menampilkan daftar menu
        System.out.println(" ===== MENU MAKANAN ===== ");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Sate Ayam");
        System.out.println("4. Soto Ayam");
        System.out.print("Pilih Menu (1-4): ");
        int pilihan = sc.nextInt();

        // Menentukan nama makanan sesuai pilihan menggunakan switch-case
        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih: 1-Nasi Goreng");
                break;
            case 2:
                System.out.println("Anda memilih: 2-Mie Ayam");
                break;
            case 3:
                System.out.println("Anda memilih: 3-Sate Ayam");
                break;
            case 4:
                System.out.println("Anda memilih: 4-Soto Ayam");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
