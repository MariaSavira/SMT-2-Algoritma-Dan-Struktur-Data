import java.util.Scanner;

public class Matakuliah07{
    static Scanner scan = new Scanner(System.in);
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah07(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    static void tambahData(Matakuliah07[] matkul){
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < matkul.length; i++){
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode        : ");
            kode = scan.nextLine();
            System.out.print("Nama        : ");
            nama = scan.nextLine();
            System.out.print("SKS         : ");
            dummy = scan.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = scan.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("=============================");

            matkul[i] = new Matakuliah07(kode, nama, sks, jumlahJam);
        }
        return;
    }

    static void cetakInfo(Matakuliah07[] matkul){
        for (int i = 0; i < matkul.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       : " + matkul[i].kode);
            System.out.println("Nama       : " + matkul[i].nama);
            System.out.println("SKS        : " + matkul[i].sks);
            System.out.println("Jumlah Jam : " + matkul[i].jumlahJam);
            System.out.println("=============================");
        }
    }
}