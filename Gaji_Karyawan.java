import java.util.Scanner;
    public class Gaji_Karyawan {
        public static void main(String[] args){

            String Nama;
            int NIK;
            int GajiPokok;
            double TunjanganTransportasi = 0.05;
            double TunjanganKinerja = 0.1;
            double Pajak = 0.025;
            double Total = 0;

            Scanner in = new Scanner(System.in);
            System.out.println("Program Menghitung Gaji Karyawan " );
            System.out.println("__________________________________");

            System.out.println("Nama Karyawan = ");
            Nama=in.nextLine();

            System.out.println("NIK Karyawan = ");
            NIK=in.nextInt();

            System.out.println("Gaji Pokok = ");
            GajiPokok=in.nextInt();

            Total = GajiPokok + (GajiPokok * TunjanganTransportasi) + (GajiPokok * TunjanganKinerja)
                    - (GajiPokok * Pajak);

            System.out.println("Total Gaji Karyawan : \n " +
                    "======================================\n" +
                    " Nama = " + Nama +
                    "\n NIK = " + NIK +
                    "\n Gaji Pokok = " + GajiPokok + "\n" +
                    " Gaji Bersih = Rp "+ Total);
        }
    }
