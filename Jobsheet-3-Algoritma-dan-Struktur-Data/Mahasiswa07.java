public class Mahasiswa07{
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    static void cetakInfo(Mahasiswa07[] mahasiswa){
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM   : " + mahasiswa[i].nim);
            System.out.println("Nama  : " + mahasiswa[i].nama);
            System.out.println("Kelas : " + mahasiswa[i].kelas);
            System.out.println("IPK   : " + mahasiswa[i].ipk);
            System.out.println("==============================");
        }
        return;
    }
}