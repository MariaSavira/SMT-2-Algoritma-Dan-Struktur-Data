import java.util.Scanner;

public class DosenDemo07{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah dosen : ");
        int input = scan.nextInt();
        String jk = "", kode, nama;
        boolean jenisKelamin = false;
        int usia;
        Dosen07[] dosen = new Dosen07[input];
        for (int i = 0; i < dosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.print("Masukkan kode dosen : ");
            kode = scan.next();
            System.out.print("Masukkan nama dosen : ");
            scan.nextLine();
            nama = scan.nextLine();
            System.out.print("Masukkan jenis kelamin dosen (Pria / Wanita) : ");
            jk = scan.nextLine();
            System.out.print("Masukkan usia dosen : ");
            usia = scan.nextInt();
            System.out.println("=======================================");
            System.out.println();

            if (jk.equalsIgnoreCase("Pria")){
                jenisKelamin = true;
            } else if (jk.equalsIgnoreCase("Wanita")){
                jenisKelamin = false;
            }

            dosen[i] = new Dosen07(kode, nama, jenisKelamin, usia);
        }
        
        DataDosen07.dataSemuaDosen(dosen, jenisKelamin);
        DataDosen07.jumlahDosenPerJenisKelamin(dosen);
        DataDosen07.rerataUsiaDosenPerJenisKelamin(dosen);
        DataDosen07.infoDosenTertua(dosen);
        DataDosen07.infoDosenTermuda(dosen);

    }
}