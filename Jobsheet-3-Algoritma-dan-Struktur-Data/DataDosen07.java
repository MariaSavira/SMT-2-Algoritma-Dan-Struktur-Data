import java.util.Scanner;

public class DataDosen07 {
    static Scanner scan = new Scanner(System.in);

    static void dataSemuaDosen(Dosen07[] dosen, boolean jenisKelamin) {
        System.out.println("\nData Dosen");
        for (Dosen07 d : dosen) {
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            if (jenisKelamin) {
                System.out.println("Jenis Kelamin : Pria");
            } else if (!jenisKelamin) {
                System.out.println("Jenis Kelamin : Wanita");
            }
            System.out.println("Usia          : " + d.usia);
            System.out.println("========================");
            System.out.println();
        }
        return;
    }

    static void jumlahDosenPerJenisKelamin(Dosen07[] dosen) {
        int jmlP = 0, jmlL = 0;
        String jenis;
        System.out.print("Cari Dosen Berdasarkan Jenis Kelamin (Pria / Wanita) : ");
        jenis = scan.nextLine();

        System.out.println("\nDosen dengan jenis kelamin " + jenis);
        for (int i = 0; i < dosen.length; i++) {
            if (jenis.equalsIgnoreCase("Pria")) {
                if (dosen[i].jenisKelamin == true) {
                    jmlL++;
                    System.out.println("Kode          : " + dosen[i].kode);
                    System.out.println("Nama          : " + dosen[i].nama);
                    System.out.println("Jenis Kelamin : " + jenis);
                    System.out.println("Usia          : " + dosen[i].usia);
                }
            } else if (jenis.equalsIgnoreCase("Wanita")) {
                if (dosen[i].jenisKelamin == false) {
                    jmlP++;
                    System.out.println("Kode          : " + dosen[i].kode);
                    System.out.println("Nama          : " + dosen[i].nama);
                    System.out.println("Jenis Kelamin : " + jenis);
                    System.out.println("Usia          : " + dosen[i].usia);
                    System.out.println();
                }
            }
        }
    }

    static void rerataUsiaDosenPerJenisKelamin(Dosen07[] dosen){
        int jmlUsia = 0, jmlDosen = 0;
        float rerata;
        String jenis;
        System.out.print("\nMasukkan jenis kelamin dosen untuk mencari rerata usia : ");
        jenis = scan.nextLine();

        System.out.println("\nDosen Dengan Jenis Kelamin " + jenis);
        for (int i = 0; i < dosen.length; i++) {
            if (jenis.equalsIgnoreCase("Pria")) {
                if (dosen[i].jenisKelamin == true) {
                    jmlUsia += dosen[i].usia;
                    jmlDosen++;
                }
            } else if (jenis.equalsIgnoreCase("Wanita")) {
                if (dosen[i].jenisKelamin == false) {
                    jmlUsia += dosen[i].usia;
                    jmlDosen++;
                }
            }
        }
        rerata = (float) jmlUsia / jmlDosen;
        System.out.println("\nRata-rata usia dosen " + jenis + " : " + rerata);
    }

    static void infoDosenTertua(Dosen07[] dosen){
        int indexTertua = 0;
        for (int i = 0; i < dosen.length; i++) {
            if (dosen[indexTertua].usia < dosen[i].usia){
                indexTertua = i;
            }
        }
        System.out.println("\nDosen Tertua adalah " + dosen[indexTertua].nama + " dengan umur " + dosen[indexTertua].usia); 
        return;
    }

    static void infoDosenTermuda(Dosen07[] dosen){
        int indexTermuda = 0;
        for (int i = 0; i < dosen.length; i++) {
            if (dosen[indexTermuda].usia > dosen[i].usia){
                indexTermuda = i;
            }
        } 
        System.out.println("\nDosen Termuda adalah " + dosen[indexTermuda].nama + " dengan umur " + dosen[indexTermuda].usia); 
        return;
    }
}