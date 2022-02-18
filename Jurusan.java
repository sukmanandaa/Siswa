package siswa;
public class Jurusan extends Nama{
    String nama= "Alena";
    String umur= "16";
    String jurusan= "RPL";
    String kelas= "10";
    public void setNama(String nama){   // ini method setter
        this.nama = nama;       // ini keyword this
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;     
    }
    @Override
    public void setUmur(String umur){
        this.umur = umur;
    }
    @Override
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    public void Cetak(){
        System.out.println("Nama Siswa ini adalah : "+super.getnama());            // ini keyword super
        System.out.println("Umur Siswa  : "+super.getUmur()+"Tahun");
        System.out.println("Saat ini siswa berada di kelas: "+super.getKelas());
        System.out.println("Siswa ini masuk pada jurusan    : "+super.getjurusan());
    }
}
