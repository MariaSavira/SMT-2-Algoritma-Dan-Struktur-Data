import java.util.Scanner;

public class DosenDemo07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DataDosen07 listDosen = new DataDosen07();

        boolean jenisKelamin = true;

        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.println("Data Dosen ke-" + (i + 1));   
            System.out.print("Masukkan kode dosen    : ");
            String kode = scan.nextLine();
            System.out.print("Masukkan nama dosen    : ");
            String nama = scan.nextLine();
            System.out.print("Masukkan jenis kelamin (P/L) : ");
            char jk = scan.next().charAt(0);
            if (jk == 'P' || jk == 'p'){
                jenisKelamin = true;
            } else if (jk == 'L' || jk == 'l'){
                jenisKelamin = false;
            }
            System.out.print("Masukkan usia dosen    : ");
            int usia = scan.nextInt();

            listDosen.tambah(listDosen.dataDosen[i] = new Dosen07(kode, nama, jenisKelamin, usia));
            scan.nextLine();
        }
        System.out.println();
        System.out.println("Data dosen awal : ");
        listDosen.tampil();

        listDosen.SortingASC();
        System.out.println();
        System.out.println("Data dosen setelah diurutkan usianya (BUBBLE SORT ASC) : ");
        listDosen.tampil();

        listDosen.SortingDSC();
        System.out.println();
        System.out.println("Data dosen setelah diurutkan usianya (SELECTION SORT DESC) : ");
        listDosen.tampil();

        listDosen.insertionSort();
        System.out.println();
        System.out.println("Data dosen setelah diurutkan usianya (INSERTION SORT DESC) : ");
        listDosen.tampil();
    }
}
