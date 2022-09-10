// Nama : Afif Nur Fauzi
// NIM  : M0521007
public class PPBO_02_Latihan3 {
    String nim, nama, alamat;
    char jenisKelamin;

    //
        //Tulis kode kalian di sini
    public PPBO_02_Latihan3(String nim, String nama, char jenisKelamin,String alamat){
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this. alamat =alamat;
    }
     //

    public static void main(String[] args) {
        PPBO_02_Latihan3 mhs = new PPBO_02_Latihan3("M0501001", "Patrick Star", 'L', "Bikini Bottom");
        
        System.out.printf("%-16s: %s\n%-16s: %s\n%-16s: %s\n%-16s: %s\n",
        "Nama", mhs.nama,
        "NIM",mhs.nim,
        "Jenis Kelamin", mhs.jenisKelamin,
        "Alamat",mhs.alamat);
    }
}

// Buatlah constructor untuk menginisiasi nilai dari variabel
// nim, nama, jenisKelamin, alamat
