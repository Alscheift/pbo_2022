
public class JumlahBilGanjil_DoWhileLoop {
    public static void main(String[] Args){
        int sum = 0;

        
        int i = 0;
        do{
            if((i%2) == 1){
                sum += 1;
            }
            i++;
        }while( i<= 25);
        System.out.println("Jumlah bilangan ganjil antara 0 dan 25 adalah " + sum);
    }
}
