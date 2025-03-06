import java.util.Scanner;

public class Dosen07 {
    String nidn;
    String nama;
    int tahunMasuk;
    String jenjangPendidikan;
    String prodi;

    static Scanner scan = new Scanner(System.in);
    public Dosen07(String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi){
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }

    static void tampilkanInfo(Dosen07[] dosen){
        for (int i = 0; i < dosen.length; i++){
                System.out.println("NIDN               : " + dosen[i].nidn);
                System.out.println("Nama               : " + dosen[i].nama);
                System.out.println("Tahun Masuk        : " + dosen[i].tahunMasuk);
                System.out.println("Jenjang Pendidikan : " + dosen[i].jenjangPendidikan);
                System.out.println("Program Studi      : " + dosen[i].prodi);
                System.out.println();
        }
        return;
    }

    static void ubahProdi(Dosen07[] dosen, String prodi, String nidnNew){
        for (int i = 0; i < dosen.length; i++) {
            if (dosen[i].nidn.equalsIgnoreCase(nidnNew)){
                System.out.println(dosen[i].prodi);
                dosen[i].prodi = prodi;
            }
        }
        return;
    }

    static void ubahPendidikan(Dosen07[] dosen, String pendidikan, String nidn){
        for (int i = 0; i < dosen.length; i++) {
            if (dosen[i].nidn.equalsIgnoreCase(nidn)){
                dosen[i].jenjangPendidikan = pendidikan;
            }
        }
        return;
    }
}
