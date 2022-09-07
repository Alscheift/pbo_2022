
    
    // file LatihanLong.java
    public class LatihanLong {
    public static void main(String args[]) {
    //long p = 2147483648; // error
    long p = 2147483648L;
    System.out.println(p);
    }
}

/*
 * 
 * Apa maksud dari pesan error yang muncul?
 * -> int is out of range, karena integer melebihi batas maksimal integer.
 * Bagaimana memperbaiki source code tersebut?
 * -> dengan menambahkan L pada akhir value dari variabel tersebut.
 * 
 */