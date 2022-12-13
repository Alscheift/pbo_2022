public class PegawaiTetap implements Pegawai {
    private Integer idPegawai;
    private Integer gajiPokok, tunjangan;
    private String namaPegawai;
    private String alamatPegawai;

    
    // Static Class Attribute & Method
    private static Integer jumlahPegawaiTetap = 0;
    public static Integer getJumlahPegawaiTetap(){
        return PegawaiTetap.jumlahPegawaiTetap;
    }

    // hitungGaji() dari interface Pegawai
    @Override
    public Integer hitungGaji() {
        return this.gajiPokok+this.tunjangan;
    }

    // Constructor
    public PegawaiTetap(String namaPegawai, String alamatPegawai, Integer gajiPokok, Integer tunjangan){
        PegawaiTetap.jumlahPegawaiTetap++;

        this.idPegawai = PegawaiTetap.getJumlahPegawaiTetap();
        this.namaPegawai = namaPegawai;
        this.alamatPegawai =alamatPegawai;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;

    }

    // Set & Get Attribut
    public void setAlamatPegawai(String alamatPegawai){
        this.alamatPegawai = alamatPegawai;
    }

    public String getAlamatPegawai(){
        return this.alamatPegawai;
    }

    public String getNamaPegawai(){
        return this.namaPegawai;
    }

    public void setGajiPokok(Integer gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public Integer getGajiPokok(){
        return this.gajiPokok;
    }

    public void setTunjangan(Integer tunjangan) {
        this.tunjangan = tunjangan;
    }

    public Integer getTunjangan(){
        return this.tunjangan;
    }

    public Integer getIdPegawai(){
        return this.idPegawai;
    }

    
}
