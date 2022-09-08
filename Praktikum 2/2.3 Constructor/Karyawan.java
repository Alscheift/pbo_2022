public class Karyawan {
    String ID, nama, divisi;
    double gaji;
    //constructor kelas karyawan
    Karyawan() {
        ID = "k001";
        nama = "Budi";
        divisi = "Produksi";
        gaji = 1750000;
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
        Karyawan karyawan1 = new Karyawan();
        karyawan1.cetakData();
    }
}
