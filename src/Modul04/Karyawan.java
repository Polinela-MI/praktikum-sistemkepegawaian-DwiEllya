package Modul04;

    public class Karyawan {

        private int nik;

        private String namaKaryawan;

        private int gapok;

        private int kehadiran;

        private int gajiPerjam;

        public Karyawan(int nik, String namaKaryawan, int gapok) {
            this.nik = nik;
            this.namaKaryawan = namaKaryawan;
            this.gapok = gapok;
            this.kehadiran = kehadiran;
            this.gajiPerjam = gajiPerjam;
        }

        public int getNik() {
            return nik;
        }

        public void setNik() {
            this.nik = nik;
        }

        public String getNamaKaryawan() {
            return namaKaryawan;
        }

        public void setNamaKaryawan(){
            this.namaKaryawan = namaKaryawan;
        }

        public int getKehadiran(){
            return kehadiran;
        }

        public void setKehadiran() {
            this.kehadiran = kehadiran;
        }

        public int getGajiPerjam() {
            return gajiPerjam;
        }

        public void setGajiPerjam(){
            this.gajiPerjam = gajiPerjam;
        }
    }

