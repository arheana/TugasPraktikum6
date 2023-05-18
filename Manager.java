public class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, int tahunMasuk, int jumlahAnak, String departemen){
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen){
        this.departemen = departemen;
    }

    public String getDepartemen(){
        return departemen;
    }

    public double getTunjangan(){
        return super.getTunjangan() + ((10/100) * getGaji());
    }

    public String toString(){
        return "Nama : " + getNama() +
                "\nJenis Kelamin : " + getJenisKelamin() +
                "\nNIK : " + getNik() +
                "\nGaji : " + getPendapatan() +
                "\nTahun Masuk : " + getTahunMasuk() +
                "\nJumlah anak : " + getJumlahAnak() +
                "\nDepartemen : " + getDepartemen();
    }
}
