public class RekeningBank {
    private String nomorRekening;
    private String pemilik;
    private double saldo;
    private String jenisRekening;

    public RekeningBank(String nomorRekening, String pemilik, double saldoAwal, String jenisRekening) {
        this.nomorRekening = nomorRekening;
        this.pemilik = pemilik;

        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0;
        }

        this.jenisRekening = jenisRekening;
    }

    // Getter nomor rekening
    public String getNomorRekening() {
        return nomorRekening;
    }

    // Getter pemilik
    public String getPemilik() {
        return pemilik;
    }

    // Getter saldo
    public double getSaldo() {
        return saldo;
    }

    // Getter jenis rekening
    public String getJenisRekening() {
        return jenisRekening;
    }

    // Method setor
    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setor harus lebih dari 0");
            return;
        }

        saldo += jumlah;
        System.out.println("Setor berhasil. Saldo: " + saldo);
    }

    // Method tarik
    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tarik harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil. Saldo: " + saldo);
        }
    }

    // Method transfer
    public void transferKe(RekeningBank tujuan, double jumlah) {
        if (tujuan == null) {
            System.out.println("Rekening tujuan tidak valid");
            return;
        }

        if (jumlah <= 0) {
            System.out.println("Jumlah transfer harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Transfer gagal, saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            tujuan.saldo += jumlah;

            System.out.println("Transfer berhasil sebesar Rp" + jumlah);
            System.out.println("Saldo pengirim: Rp" + saldo);
            System.out.println("Saldo penerima: Rp" + tujuan.saldo);
        }
    }

    // Method cetak mutasi
    public void cetakMutasi() {
        System.out.println("==============================");
        System.out.println("        LAPORAN MUTASI        ");
        System.out.println("==============================");

        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Nama Pemilik   : " + pemilik);
        System.out.println("Jenis Rekening : " + jenisRekening);
        System.out.println("Saldo Saat ini : " + saldo);

        System.out.println("==============================");
    }
}
