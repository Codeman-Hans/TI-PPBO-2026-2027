public class Latihan5 {

    // Method mengembalikan jumlah seluruh elemen array
    static int hitungTotal(int[] data) {
        int total = 0;
        for (int nilai : data) {
            total += nilai;
        }
        return total;
    }

    /* Method mengembalikan array baru berisi elemn=en-elemen yang nilainya di atas rata-rata array tersebut */
    static int[] filterDiAtasRataRata(int[] data) {
        double rataRata = (double) hitungTotal(data) / data.length;

        // Hitung dulu berapa banyak elemen yang di atas rata-rata
        int jumlahDiAtas = 0;
        for (int nilai : data) {
            if (nilai > rataRata) {
                jumlahDiAtas++;
            }
        }

        // Buat array baru seukuran jumlah elemen di atas rata-rata, lalu isi
        int[] hasil = new int[jumlahDiAtas];
        int index = 0;
        for (int nilai : data) {
            if (nilai > rataRata) {
                hasil[index] = nilai;
                index++;
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        int[] nilaiUjian = {80, 75, 90, 60, 88, 55, 70};

        System.out.println("Total seluruh elemen: " + hitungTotal(nilaiUjian));

        int[] diAtasRataRata = filterDiAtasRataRata(nilaiUjian);
        System.out.print("Elemen di atas rata-rata: ");
        for (int nilai : diAtasRataRata) {
            System.out.print(nilai + " ");
        }
    }
}
