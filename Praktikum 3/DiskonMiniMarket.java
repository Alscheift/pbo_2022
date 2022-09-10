import java.util.Scanner;
/*
a. Diskon 0% jika total pembelian di bawah 50.000
b. Diskon 5% jika total pembelian 50.000 hingga 75.000
c. Diskon 15% jika total pembelian di atas 75.000 hingga 125.000
d. Diskon 20% jika total pembelian di atas 125.000 */
public class DiskonMiniMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total pembelian : ");

        double totalPembelian = sc.nextDouble();
        double discount=0.0f;
        if(totalPembelian>125.000){
            discount = 0.20f;
        }else if(totalPembelian>75.0000){
            discount = 0.15f;
        }else if(totalPembelian>=50.000){
            discount = 0.5f;
        }
        totalPembelian *= (1-discount);
        // tambahkan code untuk menyimpan nominal total pembelian
        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan

        // tambahkan code untuk menampilkan nominal yang harus dibayar sesuai dengan ketentuan diskon yang diberikan
        System.out.println("Harga setelah discount"+""+" : "+Math.ceil(totalPembelian));
        sc.close();
    }
}