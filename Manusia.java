public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah){
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setJenisKelamin(boolean jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }

    public void setNik(String nik){
        this.nik = nik;
    }

    public void setMenikah(boolean menikah){
        this.menikah = menikah;
    }

    public String getNama(){
        return nama;
    }

    public String getJenisKelamin(){
        String jk = "";
        if (jenisKelamin == true) {
            jk = "Laki-laki";
        }
        else {
            jk = "Perempuan";
        }
        return jk;
    }

    public String  getNik(){
        return nik;
    }

    public String getMenikah(){
        return menikah == true? "menikah" : "Lajang";
    }

    public double getTunjangan() {
        double tunjangan = 0.0;
        if(menikah == true){
            if(jenisKelamin == true) {
                return 25;
            } else {
                return 20;
            }
        } else {
            return 15;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        return "nama : " + getNama() +
                "\njenis kelamin : " + getJenisKelamin() +
                "\nNIK : " + getNik() +
                "\npendapatan : " + getTunjangan();
    }
}
