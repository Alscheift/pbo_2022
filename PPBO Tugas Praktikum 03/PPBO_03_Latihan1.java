// Nama : Afif Nur Fauzi
// NIM  : M0521007

import java.util.Scanner;

public class PPBO_03_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total pembelian : ");
        
        // variabel 
        double totalPembelian, hargaSetelahDiskon, diskon;
        // tambahkan code untuk menyimpan nominal total pembelian
        totalPembelian = sc.nextInt();
        sc.close();

        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        if(totalPembelian<50000){
            diskon = 0f;
        }else if(totalPembelian<=75000){
            diskon = 0.05f;
        }else if(totalPembelian<=125000){
            diskon = 0.15f;
        }else{
            diskon = 0.20f;
        }

        hargaSetelahDiskon = Math.ceil(totalPembelian * (1f-diskon));
        // tambahkan code untuk menampilkan nominal yang harus dibayar 
        // sesuai dengan ketentuan diskon yang diberikan

        System.out.println("Total pembelian adalah "+(int)totalPembelian+"\n");
        if(diskon!=0){
            System.out.println(
                "Selamat, anda mendapatkan diskon sebesar "+ (int)(diskon*100) +"%.\n"+
                "Harga setelah diskon : " + (int)hargaSetelahDiskon+"\n"
            );
        }
        System.out.println("Silahkan membayar ke kasir !\nTerima kasih!");

        
    }
}

// Seorang mahasiswa berbelanja di mini market. Mini market tersebut memberikan diskon kepada
// pembeli dengan ketentuan
// a. Diskon 0% jika total pembelian di bawah 50.000
// b. Diskon 5% jika total pembelian 50.000 hingga 75.000
// c. Diskon 15% jika total pembelian di atas 75.000 hingga 125.000
// d. Diskon 20% jika total pembelian di atas 125.000