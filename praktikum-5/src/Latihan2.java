public class Latihan2 {

    // Method mengembalikan boolean apakah n adalah bilangan prima
    static boolean isPrima(int n) {
        if (n < 2) {
            return false; // 0 dan 1 bukan bilangan prima
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // ada pembagi selain 1 dan n sendiri
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /* Menggunakan method isPrima() di dalam loop untuk mencetak semua bilangan prima dari 1 sampai 50 */
        System.out.println("Bilangan prima dari 1 sampai 50:");
        for (int i = 1; i <= 50; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
