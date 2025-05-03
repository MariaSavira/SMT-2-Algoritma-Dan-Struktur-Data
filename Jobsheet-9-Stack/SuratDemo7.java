
import java.util.Scanner;

public class SuratDemo7 {
    public static void main(String[] args) {
        StackSurat7 stack = new StackSurat7(3);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin"); 
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Berdasarkan Nama Mahasiswa");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Id Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin: ");
                    char jenis = scan.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = scan.nextInt();
                    Surat7 srt = new Surat7(id, nama, kelas, jenis, durasi);
                    stack.push(srt);
                    System.out.printf("Surat %s berhasil dimasukkan", srt.namaMahasiswa);
                    System.out.println();
                    break;
                case 2:
                    Surat7 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Memverifikasi surat milik " + dinilai.namaMahasiswa);
                        System.out.println("Jenis Izin: " + dinilai.jenisIzin);
                        System.out.println("Durasi Izin: " + dinilai.durasi + " hari");
                        System.out.println("--------------------------------------------");
                        System.out.print("Apakah izin diterima? (Y/T): ");
                        char status = scan.next().charAt(0);
                        if (status == 'Y' || status == 'y') {
                            System.out.println("Izin diterima.");
                        } else {
                            System.out.println("Izin ditolak.");
                        }
                    }
                    break;
                case 3:
                    Surat7 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan Nama Mahasiswa yang dicari: ");
                    String cari = scan.nextLine();
                    int hasil = stack.sequentialSearching(cari);
                    if (hasil != -1) {
                        Surat7 ditemukan = stack.stack[hasil]; 
                        System.out.println("\nSurat izin ditemukan:");
                        System.out.println("ID: " + ditemukan.idSurat);
                        System.out.println("Nama: " + ditemukan.namaMahasiswa);
                        System.out.println("Kelas: " + ditemukan.kelas);
                        System.out.println("Jenis Izin: " + ditemukan.jenisIzin);
                        System.out.println("Durasi: " + ditemukan.durasi + " hari");
                    } else {
                        System.out.println("Surat izin tidak ditemukan.");
                    }
                    break;
                default:
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
