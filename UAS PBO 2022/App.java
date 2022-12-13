/* UAS Pemrograman Berbasis Objek 2022
 *
 * Afif Nur Fauzi (M0521007)
 * Kelas A 
 * Informatika 2021
 */

public class App {
    public static void main(String[] args) {
        PegawaiTetap [] arrayPegawaiTetap = new PegawaiTetap[5];
        PegawaiHonorer [] arrayPegawaiHonorer = new PegawaiHonorer[5];

        arrayPegawaiTetap[0] = new PegawaiTetap("Deni", "Jakarta", 5000011, 3500000);
        arrayPegawaiTetap[1] = new PegawaiTetap("Adi", "Medan", 4500012, 3200000);
        arrayPegawaiTetap[2] = new PegawaiTetap("Sarah", "Surabaya", 4700013, 2500000);
        arrayPegawaiTetap[3] = new PegawaiTetap("Silvia", "Semarang", 5200014, 2300000);
        arrayPegawaiTetap[4] = new PegawaiTetap("Rahmat", "Bali", 4600015, 3300000);

        arrayPegawaiHonorer[0] = new PegawaiHonorer("Zaki", "Surakarta", 3500021);
        arrayPegawaiHonorer[1] = new PegawaiHonorer("Agung", "Surakarta", 3600022);
        arrayPegawaiHonorer[2] = new PegawaiHonorer("Rangga", "Semarang", 3800023);
        arrayPegawaiHonorer[3] = new PegawaiHonorer("Rendi", "Semarang", 3900024);
        arrayPegawaiHonorer[4] = new PegawaiHonorer("Aldi", "Surabaya", 4000025);

        
        ThreadPrint thread1 = new ThreadPrint(arrayPegawaiTetap);
        ThreadPrint thread2 = new ThreadPrint(arrayPegawaiHonorer);
        thread1.start(); 
        thread2.start(); 
         
    }
}
