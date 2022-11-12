// Nama : Afif Nur Fauzi
// NIM  : M0521007
package com.java.p8a;

import com.java.p8.Buku;

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
Ya.

1. Error pada super.isbn karena access modifiernya bersifat default sementara class Buku berada pada package yang lain(yaitu com.java.p8).
2. Error pada super.penulis karena access modifiernya bersifat private sementara class BukuInherit berada di package dan class yang berbeda.
3. Error pada super.tahunTerbit karena access modifiernya bersifat default, sama seperti error #1.



 */