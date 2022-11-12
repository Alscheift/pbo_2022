// Nama : Afif Nur Fauzi
// NIM  : M0521007
package com.java.p8;

public class BukuInherit extends Buku {
    public BukuInherit(String isbn, String judul, String penulis, String penerbit, int tahunTerbit) {

        super(isbn, judul, penulis, penerbit, tahunTerbit);
        super.isbn = isbn;
        super.judul = judul;
        super.penulis = penulis;
        super.penerbit = penerbit;
        super.tahunTerbit = tahunTerbit;
    }
}

/*
Adakah error yang ditemui pada BukuInherit yang berkaitan dengan access modifier? Jelaskan
penyebab errornya!
Jawaban :
Ya.
Terdapat error pada super.penulis karena pada file Buku.java dalam package com.java.p8, 
pada attribut/variabel penulis access modifiernya private.
Sehingga hanya dapat diakses dari dalam class Buku tersebut.


 */