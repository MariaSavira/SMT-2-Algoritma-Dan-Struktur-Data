public class Mahasiswa7{
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa7(String nama, String nim, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
}