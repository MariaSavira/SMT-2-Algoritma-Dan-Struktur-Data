public class MahasiswaDemo07 {
    public static void main(String[] args) {
        MahasiswaBerprestasi07 list = new MahasiswaBerprestasi07();
        Mahasiswa07 m1 = new Mahasiswa07("123", "Zidan", "2A", 3.2);
        Mahasiswa07 m2 = new Mahasiswa07("124", "Ayu", "2A", 3.5);
        Mahasiswa07 m3 = new Mahasiswa07("125", "Sofi", "2A", 3.1);
        Mahasiswa07 m4 = new Mahasiswa07("126", "Sita", "2A", 3.9);
        Mahasiswa07 m5 = new Mahasiswa07("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting");
        list.tampil();

        System.out.println();
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();
    }
}
