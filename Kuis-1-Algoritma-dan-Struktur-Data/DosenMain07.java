import java.util.Scanner;

public class DosenMain07 {
    public static void startDosenMenu(Dosen07[] dosen) {
        Scanner scan = new Scanner(System.in);
        boolean status = true;
    
        while (status) {
            System.out.println("\nSelamat datang di halaman dosen!\n");
            System.out.println("========= MENU =========");
            System.out.println("1. Tampilkan Data Dosen");
            System.out.println("2. Ubah Prodi Dosen");
            System.out.println("3. Ubah Jenjang Pendidikan Dosen");
            System.out.println("4. Kembali ke SIAKAD");
            System.out.println("5. Selesai");
            System.out.println("========================\n");

            System.out.print("Pilih Angka : ");
            int pilih = scan.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Data Dosen : ");
                    Dosen07.tampilkanInfo(dosen);
                    break;
                case 2:
                    System.out.print("\nMasukkan NIDN Dosen : ");
                    String nidnNew = scan.nextLine();
                    scan.nextLine();
                    System.out.print("Masukkan Prodi Baru : ");
                    String prodi = scan.nextLine();
                    Dosen07.ubahProdi(dosen, prodi, nidnNew);
                    break;
                case 3:
                    System.out.print("\nMasukkan NIDN Dosen : ");
                    nidnNew = scan.nextLine();
                    scan.nextLine();
                    System.out.print("Masukkan Pendidikan Baru : ");
                    String pendidikan = scan.nextLine();
                    Dosen07.ubahPendidikan(dosen, nidnNew, pendidikan);
                    break;
                case 4:
                    MataKuliahMain07.main(new String[]{});
                    break;
                case 5:
                    status = false;
                    break;
                default:
                    System.out.println("Tolong berikan pilihan yang benar!");
                    continue;
            }
        }
    }
}
