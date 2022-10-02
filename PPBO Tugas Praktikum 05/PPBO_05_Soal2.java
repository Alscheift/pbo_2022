import java.util.Scanner;
public class PPBO_05_Soal2 {
    public static void main(String args[] ) throws Exception {
        String s;
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        input.close();

        int code=-1;
        if(s.matches("^[AaiIuUeEoO].*")){
            code = 1;
        }else if(s.matches("^(.*[^ng])(ng)")){
            code = 2;
        }
        System.out.print(code);
    }
}
