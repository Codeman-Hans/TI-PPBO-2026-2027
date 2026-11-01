public class Siswa {
    // Atribut private
    private double nilai;

    // Constructor
    public Siswa(double nilai) {
        setNilai(nilai);
    }

    // Getter nila
    public double getNilai() {
        return nilai;
    }

    // Setter dengan validasi
    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai tidak valid, harus 0-100");
        }
    }

    // Method untuk menentukan nilai huruf
    public String getNilaiHuruf() {
        if (nilai >= 80) {
            return "A";
        } else if (nilai >= 70) {
            return "B";
        } else if (nilai >= 60) {
            return "C";
        } else if (nilai >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}
