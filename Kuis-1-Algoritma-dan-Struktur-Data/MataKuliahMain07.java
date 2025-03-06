import java.util.Scanner;

public class MataKuliahMain07 {
    static Dosen07[] dosen;
    static MataKuliah07[] matkul;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kodeMK = "";
        String namaMK = "";
        int sks = 0;

        matkul = new MataKuliah07[3];

        System.out.print("Masukkan jumlah dosen : ");
        int jmlDosen = scan.nextInt();
        dosen = new Dosen07[jmlDosen];
    
        boolean status = true;
    
        while (status) {
            System.out.println("\nSelamat datang di SIAKAD!\n");
            System.out.println("========= MENU =========");
            System.out.println("1. Tampilkan Data Matkul");
            System.out.println("2. Ubah Nama Matkul");
            System.out.println("3. Ubah SKS");
            System.out.println("4. Tambah Data Dosen");
            System.out.println("5. Masuk ke halaman dosen");
            System.out.println("6. Tambah Data Matkul");
            System.out.println("7. Selesai");
            System.out.println("========================\n");

            System.out.print("Pilih Angka : ");
            int pilih = scan.nextInt();

            switch (pilih) {
                case 1:
                    MataKuliah07.tampilkanInfo(matkul, dosen);
                    break;
                case 2:
                    System.out.print("\nMasukkan Kode Matkul : ");
                    kodeMK = scan.nextLine();
                    scan.nextLine();
                    System.out.print("Masukkan Nama Matkul Baru : ");
                    namaMK = scan.nextLine();
                    MataKuliah07.ubahNamaMK(matkul, namaMK, kodeMK);
                    break;
                case 3:
                    System.out.print("\nMasukkan Kode Matkul : ");
                    kodeMK = scan.nextLine();
                    scan.nextLine();
                    System.out.print("Masukkan SKS Baru : ");
                    sks = scan.nextInt();
                    MataKuliah07.ubahSKS(matkul, kodeMK, sks);
                    break;
                case 4:
                    MataKuliah07.tambahDosen(dosen);
                    break;
                case 5:
                    DosenMain07.startDosenMenu(dosen);
                    break;
                case 6:
                    for (int i = 0; i < matkul.length; i++) {
                        System.out.print("Masukkan Kode Mata Kuliah : ");
                        kodeMK = scan.nextLine();
                        scan.nextLine();
                        System.out.print("Masukkan Nama Mata Kuliah : ");
                        namaMK = scan.nextLine();
                        System.out.print("Masukkan SKS : ");
                        sks = scan.nextInt();
                        matkul[i] = new MataKuliah07(kodeMK, namaMK, sks, dosen);
                    }
                    break;
                case 7:
                    status = false;
                    break;
                default:
                    System.out.println("Tolong berikan pilihan yang benar!");
                    continue;
            }
        }
    }
}
