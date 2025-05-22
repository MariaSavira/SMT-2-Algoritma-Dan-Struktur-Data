package dll;

import java.util.Scanner;

public class DLLMain {

    public static Mahasiswa01 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM : ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK : ");
        double ipk = scan.nextDouble();
        scan.nextLine(); // Buang newline
        return new Mahasiswa01(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu Double Linked List Mahasiswa ===");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Tambah setelah NIM tertentu");
            System.out.println("4. Hapus dari awal");
            System.out.println("5. Hapus dari akhir");
            System.out.println("6. Tampilkan seluruh data");
            System.out.println("7. Cari Mahasiswa berdasarkan NIM");
            System.out.println("8. Hapus node setelah NIM tertentu");
            System.out.println("9. Hapus node berdasarkan index");
            System.out.println("10. Tampilkan data head/tail/indeks");
            System.out.println("11. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> {
                    System.out.print("Masukkan NIM setelah mana ingin ditambahkan: ");
                    String key = scan.nextLine();
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.insertAfter(key, mhs);
                }
                case 4 -> list.removeFirst();
                case 5 -> list.removeLast();
                case 6 -> list.print();
                case 7 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node01 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 8 -> {
                    System.out.print("Masukkan NIM sebagai acuan penghapusan setelahnya: ");
                    String key = scan.nextLine();
                    list.removeAfter(key);
                }
                case 9 -> {
                    System.out.print("Masukkan indeks data yang ingin dihapus: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    list.remove(index);
                }
                case 10 -> {
                    System.out.println("1. Lihat data head");
                    System.out.println("2. Lihat data tail");
                    System.out.println("3. Lihat data pada indeks tertentu");
                    System.out.print("Pilih opsi: ");
                    int sub = scan.nextInt();
                    scan.nextLine();

                    switch (sub) {
                        case 1 -> list.getFirst();
                        case 2 -> list.getLast();
                        case 3 -> {
                            System.out.print("Masukkan indeks: ");
                            int idx = scan.nextInt();
                            scan.nextLine();
                            list.getIndex(idx);
                        }
                        default -> System.out.println("Sub-menu tidak valid!");
                    }
                }
                case 11 -> System.out.println("Jumlah data dalam list: " + list.getSize());
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        scan.close();
    }
}
