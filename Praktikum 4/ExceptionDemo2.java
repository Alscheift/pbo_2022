import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1, bil2;
        boolean lanjut = true;
        while (lanjut) {
            try {
                System.out.print("Ketik bilangan pertama : ");
                bil1 = sc.nextInt();
                System.out.print("Ketik bilangan kedua : ");
                bil2 = sc.nextInt();
                //double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
                int hasil = bil1 / bil2;

                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            } catch(ArithmeticException e){
                System.out.println("Pembagian 0 tidak boleh dilakukan");
            }
        }
        sc.close();
    }
}

/*
    == Soal & Jawaban ==
    a.  Ketik huruf untuk digunakan sebagai input bilangan pertama kemudian klik ENTER. 
        Jelaskan perbedaannya dengan ExceptionDemo1.java!
        == >
            Pada ExceptionDemo2, program akan menangkap Exception lalu mengulang kembali kode yang ada di dalam try {...}, jadi program tetap dapat berjalan karena ada yang menanganni Exception. 
            Sedangkan pada ExceptionDemo1, akan terjadi error pada program karena InputMismatch.
    b. Pembagian bilangan dengan 0 seharusnya tidak dapat dilakukan. 
        Tambahkan code exception handling untuk menangani pembagian dengan 0 pada source code tersebut.
        ==> catch(ArithmeticException e){
                System.out.println("Pembagian 0 tidak boleh dilakukan");
            }

    Catatan : 
    double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
    diganti dengan int hasil = bil1 / bil2; karena pada java, tipe data double bisa melakukan pembagian dengan 0.
 */