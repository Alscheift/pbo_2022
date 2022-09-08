// file Mahasiswa.java
public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;
    // buatlah constructor untuk menginisiasi nilai dari variabel
    // nim, nama, jenisKelamin, alamat
    Mahasiswa(String nim,String nama, char jenisKelamin,  String alamat){
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("M0501001", "Patrick Star", 'L', "Bikini Bottom");

        System.out.println(mhs.nim+' '+mhs.nama+' '+mhs.jenisKelamin+' '+mhs.alamat+'\n');
    }
}