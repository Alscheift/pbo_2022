// file ForLoopDemo.java
public class No_1_ForLoopDemo {
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

/*
 * Perulangan sebelumnya belum tepat karena indeks array dimulai dari 0, sehingga variabel i harus dimulai dari 0.
 * 
 */