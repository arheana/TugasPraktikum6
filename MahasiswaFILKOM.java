public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM (String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super (nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setIpk(double ipk){
        this.ipk = ipk;
    }

    public String getNim(){
        return nim;
    }

    public double getIpk(){
        return ipk;
    }

    public String getStatus(){
        String angkatan = "";
        String prodi = "";

        if (getNim().charAt(0) == '2') {
            if (getNim().charAt(1) == '0') {
                angkatan = "2020";
            } else if (getNim().charAt(1) == '1') {
                angkatan = "2021";
            } else if (getNim().charAt(1) == '2') {
                angkatan = "2022";
            } else if (getNim().charAt(1) == '3') {
                angkatan = "2023";
            }
        }
       
        if (getNim().charAt(6) == '2') {
            prodi = "Teknik Informatika";
        } else if (getNim().charAt(6) == '3') {
            prodi = "Teknik Komputer";
        } else if (getNim().charAt(6) == '4') {
            prodi = "Sistem Informasi";
        } else if (getNim().charAt(6) == '6') {
            prodi = "Pendidikan Teknologi Informasi";
        } else if (getNim().charAt(6) == '7') {
            prodi = "Teknologi Informasi";
        }
        return prodi + ", " + angkatan;
    }

    public double getBeasiswa() {
        double beasiswa = 0.0;
        if (ipk >= 3.0 && ipk <= 3.5) {
            beasiswa = 50;
        } else if (ipk >= 3.5 && ipk <= 4) {
            beasiswa = 75;
        } else if (ipk < 3.0) {
            beasiswa = 0.0;
        }
        return beasiswa;
    }

    public double getPendapatanAkhir() {
        double pendapatanAkhir = getBeasiswa() + super.getPendapatan();
        return pendapatanAkhir;
    }

    public String toString() {
        return "Nama : " + getNama() + 
                "\nNIK : " + getNik() + 
                "\nJenis Kelamin : " + getJenisKelamin() + 
                "\nPendapatan : " + getPendapatanAkhir() + 
                "\nIPK : " + getIpk() + 
                "\nNIM : " + getNim() + 
                "\nStatus : " + getStatus();
    }
}


