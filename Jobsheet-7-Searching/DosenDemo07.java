import java.util.Scanner;

public class DosenDemo07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DataDosen07 listDosen = new DataDosen07();

        boolean jenisKelamin;

        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.println("Data Dosen ke-" + (i + 1));   
            System.out.print("Masukkan kode dosen    : ");
            String kode = scan.nextLine();
            System.out.print("Masukkan nama dosen    : ");
            String nama = scan.nextLine();
            System.out.print("Masukkan jenis kelamin (P/L) : ");
            char jk = scan.next().charAt(0);
            jenisKelamin = (jk == 'P' || jk == 'p');

            System.out.print("Masukkan usia dosen    : ");
            int usia = scan.nextInt();
            scan.nextLine(); 

            listDosen.tambah(new Dosen07(kode, nama, jenisKelamin, usia));
        }

        System.out.println();
        listDosen.tampil();

        System.out.println("\n=================");
        System.out.println("Pencarian Data");
        System.out.println("=================\n");
        
        System.out.print("Masukkan nama dosen yang ingin dicari : ");
        String cariNama = scan.nextLine();
        System.out.print("Masukkan usia dosen yang ingin dicari : ");
        int cariUsia = scan.nextInt();

        int[] hasilNama = listDosen.PencarianDataSequential07(cariNama);
        listDosen.TampilkanDataDosen07(hasilNama, cariNama, 0);

        listDosen.SortingASC();
        int[] hasilUsia = listDosen.PencarianDataBinary07(cariUsia, 0, listDosen.idx - 1);
        listDosen.TampilkanDataDosen07(hasilUsia, null, cariUsia);
    }
}
