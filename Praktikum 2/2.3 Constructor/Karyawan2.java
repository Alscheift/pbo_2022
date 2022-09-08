public class Karyawan2 {
    String ID, nama, divisi;
    double gaji;

    //constructor kelas karyawan
    Karyawan2(String ID, String nama, String divisi, double gaji) {
        this.ID = ID;
        this.nama = nama;
        this.divisi = divisi;
        this.gaji = gaji;
    }
    void cetakData() {
        System.out.println("Data Karyawan :");
        System.out.println("ID : " + ID);
        System.out.println("Nama : " + nama);
        System.out.println("Divisi : " + divisi);
        System.out.println("Gaji : " + gaji);
    }
    double hitungSumbanganZakat() {
        double zakat = gaji * 0.025;
        return zakat;
    }
    public static void main(String[] args) {
        Karyawan2 karyawan1 = new Karyawan2("k004","Bella", "HRD", 2150000);
        karyawan1.cetakData();
    }
}
