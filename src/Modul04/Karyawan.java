package Modul04;
public class Karyawan {
    private int nik;
    private String namalengkap;
    private int Gajipokok;
    private int kehadiran;

    public Karyawan(int nik, String nama, int gajipokok) {
        this.nik = nik;
        this.namalengkap = nama;
        this.Gajipokok = gajipokok;
        this.kehadiran = kehadiran;

    }
    public int getNik() {

        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public String getNamaLengkap(){
        return namalengkap;
    }

    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }

    public int gajiPokok() {
        return Gajipokok;
    }

    public int getGajipokok() {
        return Gajipokok;
    }

    public void perhitungangaji(){
        double Tunjangan_Transportasi = Gajipokok * 0.025;
        double Tunjangan_kinerja = Gajipokok * 0.1;
        double Tunjangan_makan = 35000 * 20;
        double TotalSebelumPajak = Gajipokok + Tunjangan_Transportasi+ Tunjangan_kinerja + Tunjangan_makan;

        double pajak = TotalSebelumPajak* 0.025;
        double total = TotalSebelumPajak - pajak;

        System.out.println(" RP "  + total);
    }
}
