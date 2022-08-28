class Mahasiswa {
    public String NIM,  nama, jenis_kelamin, alamat;
    public void isiData(String NIM, String nama,String jenis_kelamin, String alamat){
         this.NIM = NIM;
         this.nama = nama;
         this.jenis_kelamin = jenis_kelamin;
         this.alamat = alamat;
    }
    public void printData(){
        System.out.println(
            "NIM           : "+this.NIM+'\n'+
            "Nama          : "+this.nama+'\n'+
            "Jenis Kelamin : "+this.jenis_kelamin+'\n'+
            "Alamat        : "+this.alamat+'\n'
            ); 
    }

}
public class Tugas_1 {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.isiData("M0521007","Afif Nur Fauzi", "Laki-Laki", "127.0.0.1");
        mhs.printData();
    }
}