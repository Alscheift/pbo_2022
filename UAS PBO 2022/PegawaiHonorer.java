public class PegawaiHonorer implements Pegawai {
    private Integer idPegawai;
    private Integer gajiPokok;
    private String namaPegawai;
    private String alamatPegawai;

    
    // Static Class Attribute & Method
    private static Integer jumlahPegawaiHonorer = 0;
    public static Integer getJumlahPegawaiHonorer(){
        return PegawaiHonorer.jumlahPegawaiHonorer;
    }

    // hitungGaji() dari interface Pegawai
    @Override
    public Integer hitungGaji() {
        return this.gajiPokok;
    }

    // override toString() untuk print object
    @Override
    public String toString() {
        return String.format(
            "ID Pegawai     : %d\n"+
            "Nama Pegawai   : %s\n"+
            "Alamat Pegawai : %s\n"+
            "Status Pegawai : %s\n"+
            "Gaji Pokok     : %d\n"+
            "Gaji Total     : %d\n",
            this.idPegawai,
            this.namaPegawai,
            this.alamatPegawai,
            "Pegawai Honorer",
            this.gajiPokok,
            this.hitungGaji()
        );
    }

    // Constructor
    public PegawaiHonorer(String namaPegawai, String alamatPegawai, Integer gajiPokok){
        PegawaiHonorer.jumlahPegawaiHonorer++;

        this.idPegawai = PegawaiHonorer.getJumlahPegawaiHonorer();
        this.namaPegawai = namaPegawai;
        this.alamatPegawai =alamatPegawai;
        this.gajiPokok = gajiPokok;

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

    public Integer getIdPegawai(){
        return this.idPegawai;
    }

    
}
