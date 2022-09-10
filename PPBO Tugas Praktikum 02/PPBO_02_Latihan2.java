// Nama : Afif Nur Fauzi
// NIM  : M0521007

class State_ic {
    public static int number;
}

public class PPBO_02_Latihan2 {
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";
    public static void main(String args[]) {
       // -> KURS_DOLLAR = 13500;
        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);

        /*State_ic one = new State_ic();
        State_ic.number = 999;
        State_ic two = new State_ic();
        State_ic.number = 404;
        System.out.println(State_ic.number);
        System.out.println(one.number);
        System.out.println(two.number);
        System.out.println("Hello, World!");*/
    }
}
// Apa yang salah dengan source code tersebut?
// Jawaban : karena mencoba melakukan assignment terhadap variabel yang mempunyai keyword "final". 
//          Keyword "final" menandakan bahwa variabel tersebut konstan dan tidak dapat diubah nilainya. 
//          
// Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
// Jawaban : Static merupakan keyword yang menyatakan bahwa variabel tersebut hanya di deklarasikan 1 kali saja dan dipakai
//           bersama-sama dalam setiap objectnya meskipun beda nama. 
//           
//           
//          (Dapat dilihat dengan mengcompile sc dibawah ini)
/*
 *      State_ic one = new State_ic();
        State_ic.number = 999;
        State_ic two = new State_ic();
        State_ic.number = 404;
        System.out.println(State_ic.number);
        System.out.println(one.number);
        System.out.println(two.number);
        System.out.println("Hello, World!");
 * 
 * 404
 * 404
 * 404
 * Hello, World!

 */
