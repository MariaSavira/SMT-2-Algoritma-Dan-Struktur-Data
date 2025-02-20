public class Mahasiswa07{
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa07(String nm, String nim, String kls, double ipk){
        nama = nm;
        this.nim = nim;
        kelas = kls;
        this.ipk = ipk;
    }

    void tampilkanInformasi(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " + ipk);
        System.out.println("Kelas : " + kelas);
    }

    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }

    void updateIPK(double ipkBaru){
        ipk = ipkBaru;
    }

    String nilaiKinerja(){
        if (ipk > 4.0 || ipk < 0){
            return "IPK tidak valid. Harus antara 0.0 dan 4.0";
        } else {
            if (ipk >= 3.5){
                return "Kinerja sangat baik";
            } else if (ipk >= 3.0){
                return "Kinerja baik";
            } else if (ipk >= 2.5){
                return "Kinerja cukup";
            } else {
                return "Kinerja kurang";
                
            }
        }
    }
}