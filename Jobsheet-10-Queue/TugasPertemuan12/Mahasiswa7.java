package TugasPertemuan12;

public class Mahasiswa7 {
    String nim;
    String nama;
    String kelas;
    static int jmlMhs = 0;
    int antrian;

    public Mahasiswa7(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        jmlMhs++;
        antrian = jmlMhs;
    }

    public void tampilData(){
        System.out.println(antrian + ". " + nim + " - " + nama + " - " + kelas);   
    }
}
