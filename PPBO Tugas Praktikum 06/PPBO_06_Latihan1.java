// Nama : Afif Nur Fauzi
// NIM  : M0521007


public class PPBO_06_Latihan1 {
    static class Mahasiswa{
        public  String nim;
        public static int kode_nim= -1;
        public Mahasiswa(){
            kode_nim++;
            nim = String.format("%04d", kode_nim);
            
        }
    }
    
    static class Kelas{
        public static  char namaKelas = ('A'-0b1);
        private int jumlah = 0;
        public static Mahasiswa [] mahasiswaArr = new Mahasiswa[5];
        Kelas(){
            namaKelas++;
            for(;jumlah<5;jumlah++){
                mahasiswaArr[jumlah] = new Mahasiswa();
            }
        }
    }
    
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Kelas[] kelas = new Kelas[5];
        
        for (int i = 0; i < kelas.length; i++){
            kelas[i] = new Kelas();

            System.out.println("Kelas " + kelas[i].namaKelas);
            
            for (int j = 0; j < kelas[i].mahasiswaArr.length; j++){
                System.out.print(" " + kelas[i].mahasiswaArr[j].nim);
            }
    
            System.out.println();
        }
    }
}

/*
Pada soal ini, kalian diminta untuk melengkapi baris kode di dalam class Mahasiswa dan Kelas.
Kalian tidak perlu mengubah baris kode yang sudah ada. (fungsi main tidak perlu diubah)
Silakan isi kode sedemikian rupa sehingga program bisa dijalankan dan menghasilkan output
(ikuti penamaan member class sesuai dengan yg digunakan pada fungsi main)

Output yang diharapkan :
--------------------------------------------------------------------

Kelas A
 00000 00001 00002 00003 00004
Kelas B
 00005 00006 00007 00008 00009
Kelas C
 00010 00011 00012 00013 00014
Kelas D
 00015 00016 00017 00018 00019
Kelas E
 00020 00021 00022 00023 00024

 --------------------------------------------------------------------

 */
