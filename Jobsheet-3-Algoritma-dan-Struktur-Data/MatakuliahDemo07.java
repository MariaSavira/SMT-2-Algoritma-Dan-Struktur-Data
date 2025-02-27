import java.util.Scanner;

public class MatakuliahDemo07{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Matakuliah07[] arrayOfMatakuliah = new Matakuliah07[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMatakuliah.length; i++){
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

            arrayOfMatakuliah[i] = new Matakuliah07(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMatakuliah[i].nama);
            System.out.println("SKS        : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("=============================");
        }
    }
}