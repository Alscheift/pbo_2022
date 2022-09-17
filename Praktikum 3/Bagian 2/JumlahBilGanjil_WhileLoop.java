
public class JumlahBilGanjil_WhileLoop {
    public static void main(String[] Args){
        int sum = 0;

        int i = 0;
        while(i <= 25){
            if((i%2) == 1){
                sum += 1;
            }
            i++;
        }
        System.out.println("Jumlah bilangan ganjil antara 0 dan 25 adalah " + sum);
    }
}
