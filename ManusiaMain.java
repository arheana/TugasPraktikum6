public class ManusiaMain {
    public static void main(String[] args) {
        Manusia orang = new Manusia("Jay Chang", true, "005987638291", false);
        System.out.println(orang.toString());
        System.out.println("==========================");

        MahasiswaFILKOM mhs = new MahasiswaFILKOM("Rhea", false, "003986745023", false, "225150839999482", 4.00);
        System.out.println(mhs.toString());
        System.out.println("==========================");

        Pekerja pkj = new Pekerja("Sharpay", false, "012398765398", true, 40, 2008, 3);
        System.out.println(pkj.toString());
        System.out.println("==========================");

        Manager mng = new Manager("Troy", true, "025890011973", false, 90, 2004, 0, "Pengembangan Sumber Daya");
        System.out.println(mng.toString());
    }
}
