package Modul04;

    public class KaryawanParuhWaktu extends Karyawan {

    private int TotalJamKerja;
    private int gajiperjam;
    private int Lembur;
    private int Penalty;

    public KaryawanParuhWaktu(int nik, String nama, int gajipokok) {
        super(nik, nama, gajipokok);
    }

    public int getTotalJamKerja() {
        return TotalJamKerja;
    }

    public void setTotalJamKerja(int TotalJamKerja) {
        this.TotalJamKerja = TotalJamKerja;
    }

    public int getLembur() {
        return Lembur;
    }

    public void setLembur(int lembur) {
        this.Lembur = lembur;
    }

    public int getPenalty() {
        return Penalty;
    }

    public void setPenalty(int penalty) {
        this.Penalty = penalty;

    }

    @Override
    public void perhitungangaji() {
        super.perhitungangaji();
        double GajiPerMinggu = gajiperjam * 20;
        double Tunjangan_Transportasi = GajiPerMinggu * 0.05;
        double TotalGaji = GajiPerMinggu + Tunjangan_Transportasi;

        if (TotalJamKerja > 20) ;
        Lembur = (TotalJamKerja - 20) * (getGajipokok() + 2000);
        TotalGaji = TotalGaji + Lembur;

        if (TotalJamKerja < 20) ;
        Penalty = (20 - TotalJamKerja) * getGajipokok();
        TotalGaji = TotalGaji - Penalty;

        double Pajak = TotalGaji * 0.025;
        double Total = TotalGaji - Pajak;

    }
}
