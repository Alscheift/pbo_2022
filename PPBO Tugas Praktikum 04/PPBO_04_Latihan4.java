// Nama : Afif Nur Fauzi
// NIM  : M0521007

import java.util.Scanner;

public class PPBO_04_Latihan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        @SuppressWarnings("unused")
        int x = 10;

        try {
            while(true){
                System.out.println("Please input non-integer to trigger exception: ");
                x = scanner.nextInt();
            }
        } catch (Exception e) {
           StackTraceElement[] _STKTRC = e.getStackTrace();
           int _LEN = _STKTRC.length; 

            int exceptionLineNumber=_STKTRC[(_LEN-1)].getLineNumber(); // simpan angka exception line number di variabel ini
            System.out.println("Whoops! exception occured on line: " + exceptionLineNumber);
        }

        scanner.close();
    }
}

//      Pada latihan ini kalian diminta untuk mencetak exception line number atau baris ke berapa penyebab 
// terjadinya exception. Sebelumnya kalian sudah mengenal method printStackTrace() yang akan mencetak 
// urutan stack exception. Pada baris terakhir stack trace, terdapat informasi letak exception line number 
// yang terjadi pada source code ini. 
// Akses exception line number tersebut dan simpan pada variabel exceptionLineNumber!

// Hint:
//  - selidiki method dan field yang tersedia
//  - proses pencarian dimulai dari mengakses stack trace
//  - trace yang diperlukan berada di paling akhir stack

// Output yang diharapkan:
// Whoops! exception occured on line: 12