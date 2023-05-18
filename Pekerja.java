public class Pekerja extends Manusia {
    private double gaji;
    private int tahunMasuk;
    private int jumlahAnak;

    public Pekerja (String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, int tahunMasuk, int jumlahAnak){
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji){
        this.gaji = gaji;
    }

    public void setTahunMasuk(int tahunMasuk){
        this.tahunMasuk = tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak){
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji(){
        return gaji;
    }

    public int getTahunMasuk(){
        return tahunMasuk;
    }

    public int getJumlahAnak(){
        return jumlahAnak;
    }

    public double getBonus(){
        double tahun = 2023 - this.tahunMasuk;
        if (tahun > 10) {
            return gaji * (15.0/100);
        }
        else if (tahun > 5) {
            return gaji * (10.0/100);
        }
        else {
            return gaji * (5.0/100);
        }
    }

    public double getPendapatan() {
        return super.getPendapatan() + getGaji() + getBonus();
    }

    public String toString(){
        return "Nama : " + getNama() +
                "\nNIK : " + getNik() +
                "\nJenis Kelamin : " + getJenisKelamin() +
                "\nPendapatan : " + getPendapatan() +
                "\nTahun Masuk : " + getTahunMasuk() +
                "\nJumlah anak : " + getJumlahAnak() +
                "\nGaji : " + getGaji();
    }

}
