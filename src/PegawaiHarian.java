public class PegawaiHarian extends Pegawai {
    private int jumlahJamKerja;
    private double upahPerJam;

    public PegawaiHarian(String nama, int jumlahJamKerja, double upahPerJam) {
        super(nama); // Memanggil konstruktor superclass
        this.jumlahJamKerja = jumlahJamKerja;
        this.upahPerJam = upahPerJam;
    }

    @Override
    public double hitungGaji() {
        return jumlahJamKerja * upahPerJam;
    }
}