import java.util.Scanner;

public class MataKuliah07 {
    static Scanner scan = new Scanner(System.in);
    String kodeMK;
    String namaMK;
    int sks;
    Dosen07[] dosenPengampu;

    public MataKuliah07(String kodeMK, String namaMK, int sks, Dosen07[] dosenPengampu){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
    }

    static void tampilkanInfo(MataKuliah07[] matkul, Dosen07[] dosen){
        System.out.println("\nData Mata Kuliah");
        for (int i = 0; i < matkul.length; i++) {
            System.out.println("\nKode Mata Kuliah : " + matkul[i].kodeMK);
            System.out.println("Mata Kuliah        : " + matkul[i].namaMK);
            System.out.println("SKS                : " + matkul[i].sks);

            Dosen07.tampilkanInfo(dosen);
        }
    }

    static void ubahNamaMK(MataKuliah07[] matkul, String namaMKBaru, String kodeMK){
        for (int i = 0; i < matkul.length; i++) {
            if (matkul[i].kodeMK == kodeMK){
                matkul[i].namaMK = namaMKBaru;
            }
        }
        return;
    }

    static void ubahSKS(MataKuliah07[] matkul, String kodeMK, int SKS){
        for (int i = 0; i < matkul.length; i++) {
            if (matkul[i].kodeMK == kodeMK){
                matkul[i].sks = SKS;
            }
        }
        return;
    }

    static void tambahDosen(Dosen07[] dosen){
        for (int i = 0; i < dosen.length; i++) {
            System.out.print("\nNIDN               : ");
            String nidn = scan.nextLine();
            System.out.print("Nama               : ");
            String nama = scan.nextLine();
            System.out.print("Tahun Masuk        : ");
            int tahunMasuk = scan.nextInt();
            System.out.print("Jenjang Pendidikan : ");
            scan.nextLine();
            String jenjangPendidikan = scan.nextLine();
            System.out.print("Prodi              : ");
            String prodi = scan.nextLine();

            dosen[i] = new Dosen07(nidn, nama, tahunMasuk, jenjangPendidikan, prodi);
        } 
    }
}
