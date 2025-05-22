package dll;
import java.util.Scanner;

public class DLLMain {
    public static Mahasiswa01 inputMahasiswa(Scanner scan){
        System.out.print("Masukkan NIM : ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK : ");
        double ipk = scan.nextDouble();
        return new Mahasiswa01(nim, nama, kelas, ipk);
    }
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do { 
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Tambah setelah ...");
            System.out.println("4. Hapus dari awal");
            System.out.println("5. Hapus dari akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Cari Mahasiswa berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan){
                case 1 -> {
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> {
                    System.out.print("\nTambah setelah NIM : ");
                    String keyNim = scan.nextLine();
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.insertAfter(keyNim, mhs);
                }
                /*Karena praktikum 1 belum ada removeFirst, removeLast, dan Search
                Maka saya jadikan komentar dulu yaa buuu*/

                // case 4 -> list.removeFirst();
                // case 5 -> list.removeLast();
                case 6 -> list.print();
                // case 7 -> {
                //     System.out.println("Masukkan NIM yang dicari : ");
                //     String nim = scan.nextLine();
                //     Node01 found = list.search(nim);
                //     if (found != null){
                //         System.out.println("Data ditemukan : ");
                //         found.data.tampil();
                //     } else {
                //         System.out.println("Data tidak ditemukan.");
                //     }
                // }
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        scan.close();
    }
}
