package Modul05;

public class Karyawan {
    private String Nama;
    int gajipokok;
    int totalgaji;
    int NIK;

    public static int currentNIK = 0;
   double tunjanganTransportasi;
   double misc;
   double pajak;

    public Karyawan(String Nama, int gajiPokok) {currentNIK++;
        this.Nama = Nama;
        this.NIK = currentNIK;
    }
    // ini method Setter
    public void setTunjanganTransportasi(){
        this.tunjanganTransportasi = tunjanganTransportasi;
    }
    public void setmisc(){
        this.misc = misc;
    }

    //ini method getter
    public double getTunjanganTransportasi(){
        return tunjanganTransportasi;
    }
    public double getmisc(){
        return misc;
    }
    public double getpajak() {
        return pajak;
    }
    public int getgajipokok(){
        return this.gajipokok;
    }

    public String getNama() {
        return this.Nama;
    }

    public int totalgaji(){
        return this.totalgaji;
    }
}


