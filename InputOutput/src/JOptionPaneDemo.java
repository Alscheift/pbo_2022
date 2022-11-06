import java.io.File;

import javax.swing.JOptionPane;

public class JOptionPaneDemo {
    public static void main(String[] args){
        String m = JOptionPane.showInputDialog("Ketik nama anda : ");
        JOptionPane.showMessageDialog(null, "Selamat datang, "+ m);

        File inFile = new File("src/App.java");
        if(inFile.exists()){
            // menampilkan pesan kalau file yang dimaksud ada
            JOptionPane.showMessageDialog(null, "file "+inFile.getName()+" ada");
        }else{
            JOptionPane.showMessageDialog(null, "file "+inFile.getName()+" tidak ada");
        }
    }    
}
