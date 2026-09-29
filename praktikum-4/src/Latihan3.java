import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Membuat array berukuran 10
        dan mengisinya dengan inout pengguna */
        int[] angka = new int[10];
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }

        /* Menampilkan array dari elemen terakhir
        ke elemen pertama (terbalik) */
        System.out.println("Array dalam urutan terbalik:");
        for (int i = angka.length - 1; i >= 0; i--) {
            System.out.println(angka[i]);
        }
    }
}
