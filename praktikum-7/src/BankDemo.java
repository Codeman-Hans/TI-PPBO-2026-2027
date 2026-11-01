public class BankDemo {
      public static void main(String[] args) {
          // Membuat dua objek rekening
          RekeningBank rek1 = new RekeningBank("001", "Budi", 100000, "Tabungan");
          RekeningBank rek2 = new RekeningBank("002","Andi",200000, "Giro");

          // Menampilkan data awal
          System.out.println("=== DATA AWAL ===");
          System.out.println("Saldo Budi: Rp" + rek1.getSaldo());
          System.out.println("Saldo Andi: Rp" + rek2.getSaldo());

          // Setor pada masing-masing rekening
          System.out.println("\n=== TRANSAKSI SETOR ===");
          rek1.setor(50000);
          rek2.setor(100000);

          // Tarik pada masing-masing rekening
          System.out.println("\n=== TRANSAKSI TARIK ===");
          rek1.tarik(20000);
          rek2.tarik(50000);

          // Transfer berhasil
          System.out.println("\n=== TRANSFER BERHASIL ===");
          rek1.transferKe(rek2,30000);

          // Transfer gagal
          System.out.println("\n=== TRANSFER GAGAL ===");
          rek1.transferKe(rek2,500000);

          // Menampilkan mutasi akhir
          System.out.println("\n=== MUTASI AKHIR ===");

          System.out.println("\nREKENING PERTAMA");
          rek1.cetakMutasi();

          System.out.println("\nREKENING KEDUA");
          rek2.cetakMutasi();
      }
}


