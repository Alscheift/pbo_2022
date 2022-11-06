import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Pelajar implements Serializable{
    protected String NIM, nama;
    protected Integer umur; 
}
public class ByteMhs {
    static String path = "file/mhs.sav";
    public static void main(String [] args) throws IOException, ClassNotFoundException{
        File mhs = new File(path);
        if(mhs.exists()){
            //System.out.println("ada");
        }else{
            System.out.println("tidak ada");
            mhs.createNewFile();
        }

        int pil = 2; // ganti disini
        Pelajar pelajar;
        if(pil==1){
            FileOutputStream fout = new FileOutputStream(mhs);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            pelajar = new Pelajar();
            pelajar.NIM = "Z0222022";
            pelajar.nama = "Zen";
            pelajar.umur = 23;
            
            oout.writeObject(pelajar);
            oout.close();
            
            
        }else if(pil==2){
            FileInputStream fin = new FileInputStream(mhs);
            ObjectInputStream oin = new ObjectInputStream(fin);
            pelajar = new Pelajar();
            
            pelajar = (Pelajar)oin.readObject();
            System.out.println("Nama : "+pelajar.nama+"\nNIM : "+pelajar.NIM);
            oin.close();
        }
       
    }
}
