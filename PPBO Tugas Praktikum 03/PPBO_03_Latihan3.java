// Nama : Afif Nur Fauzi
// NIM  : M0521007

public class PPBO_03_Latihan3 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        //  -- Perulangan sebelum --
        // for (int i = 1; i < 6; i++) {
        //     System.out.println("elemen ke-" + i + " = " + arr[i]);
        // }

        // -- Perulangan Sesudah --
        for (int i = 0; i < 6; i++) {
            System.out.println("elemen ke-" + i + " = " + arr[i]);
        }
    }
}

// Berikut ini adalah code untuk menampilkan elemen (anggota) sebuah array yang berupa bilangan
// integer, mulai dari elemen pertama hingga terakhir.

// Eksekusi source code tersebut dan jelaskan apakah penulisan kode perulangan dengan for pada code
// tersebut sudah tepat dan tuliskan perbaikan apabila diperlukan!

// Jawab:  
/*
 * 
 * Perulangan sebelumnya belum tepat karena indeks array dimulai dari 0.
 * Karena variable i merupakan variable yang digunakan untuk iterasi array, maka i harus dimulai dari 0.
 * 
 */