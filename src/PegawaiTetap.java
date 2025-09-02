public class PegawaiTetap extends Pegawai {
    private double gajiBulanan;

    public PegawaiTetap(String nama, double gajiBulanan) {
        super(nama); // Memanggil konstruktor superclass
        this.gajiBulanan = gajiBulanan;
    }

    @Override
    public double hitungGaji() {
        return gajiBulanan;
    }
}