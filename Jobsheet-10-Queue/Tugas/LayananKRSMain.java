package Tugas;
import java.util.Scanner;

public class LayananKRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan KRS ==-");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani 2 Mahasiswa");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Mahasiswa Terdepan");
            System.out.println("5. Cek antrian paling belakang");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("7. Jumlah Mahasiswa yang sudah diproses");
            System.out.println("8. Jumlah Mahasiswa yang belum melakukan proses KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM       : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama      : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi     : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas     : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.prosesKRS2Mahasiswa();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break; 
                case 4:
                    antrian.lihat2Terdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah mahasiswa yang sudah diproses: " + antrian.getJmlDilayani());
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa yang belum melakukan KRS: " + antrian.getSisaLayanan());
                    break;                                     
                default:
                    break;
            }
        } while (pilihan != 0);
        sc.close();
    }    
}