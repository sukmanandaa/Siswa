package siswa;
public class Nama {
    
    // ini modifier private
    private String nama;
    private String umur;
    private String kelas;
    private String jurusan;
    
    // ini method setter
        public void setnamaSiswa(String nama)  {
            this.nama = nama;   // ini keyword this
        }
        public void setjurusanSiswa(String jurusan) {
            this.jurusan = jurusan;
        }
        public void setUmur(String umur){
            this.umur = umur;
        }
        public void setKelas(String kelas){
            this.kelas = kelas;
        }
    // ini method getter
        public String getnama(){
            return this.nama;
        }
        public String getjurusan(){
            return this.jurusan;
        }
        public String getUmur(){
            return this.umur;
        }
        public String getKelas(){
            return this.kelas;
        }
        public void cetak(){
        System.out.println("Nama Siswa ini adalah           : "+nama);     
        System.out.println("Umur Siswa                      : "+umur+ " Tahun ");
        System.out.println("Saat ini siswa berada di kelas  : "+kelas);
        System.out.println("Siswa ini masuk pada jurusan    : "+jurusan);
    }
        }

