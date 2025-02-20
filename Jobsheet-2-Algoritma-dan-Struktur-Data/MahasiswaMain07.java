public class MahasiswaMain07 {
    public static void main(String[] args) {
        Mahasiswa07 mhs1 = new Mahasiswa07("", "", "", 0.0);
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa07 mhs2 = new Mahasiswa07("Annisa Nabila", "2141720160", "TI 2L", 3.25);
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa07 mhsMaria = new Mahasiswa07("Maria Savira", "244107060144", "SIB 1A", 3.95);
        mhsMaria.tampilkanInformasi();
        System.out.println(mhsMaria.nilaiKinerja());

    }
}