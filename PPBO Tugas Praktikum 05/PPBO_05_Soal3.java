import java.util.Scanner;
public class PPBO_05_Soal3 {
    public static void main(String args[] ) throws Exception {
        char c1,c2, ct;
        Scanner input = new Scanner(System.in);
        c1 = input.next().charAt(0);
        c2 = input.next().charAt(0);
        input.close();
        
        if(c1>c2){
            ct=c2;
            c2=c1;
            c1=ct;
        }
        String o = "";
        for(;c1<=c2;c1++){
            o+=c1;
        }
        System.out.print(o);
    }
}
