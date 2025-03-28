public class Dosen07 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen07(String kd, String nama, Boolean jk, int age) {
        kode = kd;
        this.nama = nama;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Kode Dosen    : " + kode);
        System.out.println("Nama          : " + nama);
        String jk = "";
        if (jenisKelamin == true){
            jk = "Perempuan";
        } else if (jenisKelamin == false){
            jk = "Laki-laki";
        }
        System.out.println("Jenis Kelamin : " + jk);
        System.out.println("Usia          : " + usia);
        System.out.println();
    }
}
