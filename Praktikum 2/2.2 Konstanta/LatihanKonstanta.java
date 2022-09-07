public class LatihanKonstanta {
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";

    public static void main (String args[]){
        // KURS_DOLLAR = 13500; // error

        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);

    }
}

// error karena KURS_DOLLAR merupakan variabel final, yang berarti hanya bisa diberi nilai/di-assign satu kali saja.
// untuk mengatasi masalah tersebut  dapat dengan cara membuat variabel kurs dollar menjadi variabel non konstan.