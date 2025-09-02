public abstract class Pegawai {
    protected String nama;

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Metode abstract yang harus diimplementasikan oleh subclass
    public abstract double hitungGaji();
}