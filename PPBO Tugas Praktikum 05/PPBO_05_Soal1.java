import java.util.Scanner;

public class PPBO_05_Soal1 {
    public static void main(String args[] ) throws Exception {
        String s;
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        input.close();
        for(int a=0;a < s.length();a+=3){
            System.out.print(s.charAt(a));
        }
    }
}