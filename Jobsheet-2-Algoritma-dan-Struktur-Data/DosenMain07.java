public class DosenMain07{
    public static void main(String[] args) {
        Dosen07 dosen1 = new Dosen07("", "", false, 0, "");
        dosen1.idDosen = "1";
        dosen1.nama = "Maria Savira";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2019;
        int tahunSekarang = 2025;
        dosen1.bidangKeahlian = "Teknologi Informasi";

        dosen1.tampilInformasi(); 
        dosen1.hitungMasaKerja(tahunSekarang);

        Dosen07 dosen2 = new Dosen07("2", "Nagita Slavina", false, 2000, "Olahraga");
        String bidang = "Hukum";
        dosen2.tampilInformasi();
        dosen2.hitungMasaKerja(tahunSekarang);
        dosen2.ubahKeahlian(bidang);
        dosen2.setStatusAktif(true);
        dosen2.tampilInformasi();
        dosen2.hitungMasaKerja(tahunSekarang);
        
    }
}