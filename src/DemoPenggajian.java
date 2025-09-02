public class DemoPenggajian {
    public static void main(String[] args) {
        // Membuat objek Pegawai Tetap
        Pegawai pegawai1 = new PegawaiTetap("Dina", 50000000.0); // Polimorfisme: referensi Pegawai, objek PegawaiTetap

        // Membuat objek Pegawai Harian
        Pegawai pegawai2 = new PegawaiHarian("Andi", 160, 250000.0); // Polimorfisme: referensi Pegawai, objek PegawaiHarian

        // Menampilkan gaji menggunakan polimorfisme
        System.out.println("Gaji " + pegawai1.getNama() + ": Rp" + (long) pegawai1.hitungGaji());
        System.out.println("Gaji " + pegawai2.getNama() + ": Rp" + (long) pegawai2.hitungGaji());
    }
}