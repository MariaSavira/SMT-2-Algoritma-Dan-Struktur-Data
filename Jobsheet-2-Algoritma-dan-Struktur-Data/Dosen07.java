public class Dosen07{
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    String statusDosen;

    public Dosen07(String id, String nama, boolean status, int thn, String bidang){
        idDosen = id;
        this.nama = nama;
        statusAktif = status;
        tahunBergabung = thn;
        bidangKeahlian = bidang;
    }

    void tampilInformasi(){
        setStatusAktif(statusAktif);
        System.out.println("\nId Dosen : " + idDosen);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("Status : " + statusDosen);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status){
        this.statusAktif = status;
        
        if (statusAktif == false){
            statusDosen = "Tidak aktif";
        } else if (statusAktif == true){
            statusDosen = "Aktif";
        }
    }

    int hitungMasaKerja(int tahunSekarang){
        int masaKerja = tahunSekarang - tahunBergabung;
        System.out.println("Masa Kerja : " + masaKerja + " tahun");
        return masaKerja;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}