import java.text.DecimalFormat;

// Nama : Afif Nur Fauzi
// NIM  : M0521007
public class PPBO_02_Latihan1 {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.0;
        float c = 4.3f;

        double ac = Double.valueOf(a) + Double.valueOf(c);
        double abc = ac + Double.valueOf(b);

        DecimalFormat df = new DecimalFormat("#.#");
        System.out.printf(df.format(abc));
    }
}

// ubah variabel a dan c ke tipe data double
// jumlahkan variabel a, b, dan c
// tampilkan hasil penjumlahan ketiga variabel

/*
 * Output yang diharapkan:
    17.3
 */