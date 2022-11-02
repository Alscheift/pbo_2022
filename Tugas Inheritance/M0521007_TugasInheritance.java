/* == Tugas Inheritance (2 November 2022) ==
 * Nama  : Afif Nur Fauzi
 * NIM   : M0521007
 * Kelas : A
 */


public class M0521007_TugasInheritance {
    public static void main(String []args){
        KaryawanTetap ktetap1 = new KaryawanTetap("117","John","Elysium",20000000,110307,5000000);
        KaryawanKontrak kkontrak1 = new KaryawanKontrak("WA1", "Wawan", "Jebres", 311311, 11);

        System.out.println("Gaji "+ktetap1.getNama()+" adalah : "+ktetap1.hitungGaji());
        System.out.println("Gaji "+kkontrak1.getNama()+" adalah : "+kkontrak1.hitungGaji());

    }
}

class Karyawan{
    protected String id,nama,alamat;
    protected Integer gaji;

    public Karyawan(String id,String nama,String alamat,Integer gaji){
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.gaji = gaji;
    }
    public String getId(){return this.id;}
    public String getNama(){return this.nama;}
    public String getAlamat(){return this.alamat;}
    
    public void setGaji(Integer gaji){this.gaji = gaji;}
    public Integer getGaji(Integer gaji){return this.gaji;}
    
    
    
    public Integer hitungGaji(){
        return this.gaji;
    }
    
}

class KaryawanTetap extends Karyawan{
    private Integer gajiBulanan, uangMakan, tunjangan;

    public KaryawanTetap(String id, String nama, String alamat, Integer gajiBulanan, Integer uangMakan, Integer tunjangan) {
        super(id, nama, alamat, 0);
        this.gajiBulanan = gajiBulanan;
        this.uangMakan = uangMakan;
        this.tunjangan = tunjangan;
        this.hitungGaji();
    }

    public void setgajiBulanan(Integer gajiBulanan){
        this.gajiBulanan = gajiBulanan;
        this.hitungGaji();
    }

    public Integer getgajiBulanan(){
        return this.gajiBulanan;
    }

    public void setUangMakan(Integer uangMakan){
        this.uangMakan = uangMakan;
        this.hitungGaji();
    }

    public Integer getUangMakan(){
        return this.uangMakan;
    }

    public void setTunjangan(Integer tunjangan){
        this.tunjangan = tunjangan;
        this.hitungGaji();
    }

    public Integer getTunjangan(){
        return this.tunjangan;
    }
    
    public Integer hitungGaji(){
        gaji = gajiBulanan + uangMakan + tunjangan;
        return gaji;
    }
}

class KaryawanKontrak extends Karyawan{
    private Integer gajiHarian,jumlahHariMasuk;

    public KaryawanKontrak(String id, String nama, String alamat, Integer gajiHarian, Integer jumlahHariMasuk) {
        super(id, nama, alamat, 0);
        this.gajiHarian = gajiHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
        hitungGaji();
    } 

    public void setGajiHarian(Integer gajiHarian){
        this.gajiHarian = gajiHarian;
        hitungGaji();
    }

    public Integer getGajiHarian(){
        return this.gajiHarian;
    }

    public void setJumlahHariMasuk(Integer jumlahHariMasuk){
        this.jumlahHariMasuk = jumlahHariMasuk;
        hitungGaji();
    }

    public Integer getJumlahHariMasuk(){
        return this.jumlahHariMasuk;
    }
    
    public Integer hitungGaji(){
        gaji = gajiHarian * jumlahHariMasuk;
        return gaji;
    }
}

