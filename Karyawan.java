import java.util.Locale;
public class Karyawan{
    private int nik;
    private String nama;
    private int gajipokok;

    public Karyawan (int nik,String nama,int gajipokok){
        this.nik = nik;
        this.nama = nama;
        this.gajipokok = gajipokok;

    }
    public int getNik(){
        return nik;
    }
    public String getNama(){
        return nama;
    }
    public int Gajipokok(){
        return gajipokok;
    }
    public void hitunggaji(){
        double tunjanganTransport = gajipokok * 0.05;
        double tunjanganKinerja = gajipokok * 0.1;
        double tunjanganmakan = 35000 * 20;
        double totalSebelumpajak = gajipokok + tunjanganTransport + tunjanganKinerja + tunjanganmakan;

        double pajak = totalSebelumpajak * 0.025;
        double total = totalSebelumpajak - pajak;

        System.out.println("Rp " + total);
    }
}