public class MataKuliahMain07 {
    public static void main(String[] args) {
        MataKuliah07 matkul1 = new MataKuliah07("1", "Algoritma Pemrograman", 2, 5);
        System.out.println("\n");
        matkul1.tampilInformasi();
        matkul1.tambahJam(4);
        System.out.println("\n");
        matkul1.tampilInformasi();

        MataKuliah07 matkul2 = new MataKuliah07(null, null, 0, 0);
        matkul2.kodeMk = "2";
        matkul2.nama = "Basis Data";
        matkul2.sks = 3;
        matkul2.jumlahJam = 3;

        System.out.println("\n");
        matkul2.tampilInformasi();
        matkul2.kurangJam(4);
        matkul2.ubahSKS(4);
        System.out.println("\n");
        matkul2.tampilInformasi();
    }
}