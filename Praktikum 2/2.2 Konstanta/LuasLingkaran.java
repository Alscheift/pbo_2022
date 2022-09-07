// file LuasLingkaran.java
import javax.swing.JOptionPane;
public class LuasLingkaran {
    public static void main(String[] args) {
        // Deklarasi konstanta
        final double PI = 3.14159;
        // Deklarasi variabel jari2 dan luas
        int jari2;
        double luas;
        // Memberi nilai awal ke variabel jari2
        jari2 = 7;
        // Menghitung luas lingkaran
        luas = PI * jari2 * jari2;
        // Menampilkan hasil di kotak dialog
        JOptionPane.showMessageDialog(null, "Jari-jari lingkaran = " + jari2

        + "\nLuas lingkaran = " + luas,

        "Menghitung Luas", JOptionPane.INFORMATION_MESSAGE);

        // Mengakhiri program yang menampilkan GUI
        System.exit(0);
    }
}