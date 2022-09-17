// Nama : Afif Nur Fauzi
// NIM  : M0521007

import java.util.Scanner;

class PPBO_03_Latihan2 {
    public static void main(String[] args) {
        System.out.print("Apakah tahun ini kabisat?\nMasukkan tahun.\n>");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        // tuliskan kodemu di sini
        System.out.println(year + " is" +(isLeapYear(year)?" ":" not ")+"a leap year");

        sc.close();
    }

    public static boolean isLeapYear(int year){
        //https://learn.microsoft.com/en-us/office/troubleshoot/excel/determine-a-leap-year
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }
        }
        return false;
    }
}

// Buatlah conditional statement untuk melakukan pengecekan terhadap input variabel 'year'
// Cek apakah input merupakan tahun kabisat
// Jika tahun kabisat, berikat output '... is a leap year'
// Jika bukan tahun kabisat, berikan output '... is not a leap year'
// ... di atas maksudnya adalah nilai variabel 'year' yang diinputkan

// Contoh 
// input : 2020
// output : 2020 is a leap year

// Contoh
// input : 2031
// output : 2031 is not a leap year