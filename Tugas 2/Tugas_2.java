import java.util.Scanner;

public class Tugas_2 {
    public static void main(String args[]){
        int skor=100;
        float angka=4.00f;
        String huruf = "A";
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan skor :");
        skor = input.nextInt();
        if(skor>=85){
            huruf = "A";
            angka=4.00f;
        }else if(skor>= 80 && skor <=84){
            huruf = "A-";
            angka=3.70f;
        }else if(skor>= 75 && skor <=79){
            huruf = "B+";
            angka=3.30f;
        }else if(skor>= 70 && skor <=74){
            huruf = "B";
            angka=3.00f;
        }else if(skor>= 65 && skor <=69){
            huruf = "C+";
            angka=2.70f;
        }else if(skor>= 60 && skor <=64){
            huruf = "C";
            angka=2.00f;
        }else if(skor>= 59 && skor <=59){
            huruf = "D";
            angka=1.00f;
        }else{
            huruf = "E";
            angka=0.00f;
        }

        System.out.println(
            "Angka\t:"+angka+"\nHuruf\t:"+huruf);
        input.close();
    }
}
