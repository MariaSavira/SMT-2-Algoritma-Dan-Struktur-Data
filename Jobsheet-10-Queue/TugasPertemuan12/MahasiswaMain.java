package TugasPertemuan12;

import java.util.Scanner;

public class MahasiswaMain {
    static Scanner scan = new Scanner(System.in);
    static int max;
    static SingleLinkedList baru;

    public static void tambahAntrian() {
        System.out.print("Masukkan NIM : ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();
        baru.enqueue(nim, nama, kelas);
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah antrian : ");
        max = scan.nextInt();
        baru  = new SingleLinkedList(max);

        boolean ulang = true;
        do {
            System.out.println("\n-- Antrian Mahasiswa --");
            System.out.println("1. Tambah antrian");
            System.out.println("2. Cek antrian kosong");
            System.out.println("3. Cek antrian penuh");
            System.out.println("4. Print antrian");
            System.out.println("5. Kosongkan antrian");
            System.out.println("6. Panggil antrian");
            System.out.println("7. Tampilkan antrian terdepan");
            System.out.println("8. Tampilkan antrian terakhir");
            System.out.println("9. Jumlah mahasiswa yang mengantri");
            System.out.println("0. Keluar\n");
            System.out.print("Pilih menu : ");
            int menu = scan.nextInt();
            scan.nextLine();
            System.out.println();

            switch (menu) {
                case 1:
                    tambahAntrian();
                    break;
                case 2:
                    if (baru.isEmpty()){
                        System.out.println("Antrian masih kosong!");  
                    } else {
                        System.out.println("Antrian tidak kosong.");
                        System.out.println("Antrian saat ini : " + baru.size);
                    };
                    break;
                case 3:
                    if (baru.isFull()){
                        System.out.println("Antrian sudah penuh!");
                    } else {
                        System.out.println("Antrian belum penuh.");
                        System.out.println("Antrian sisa : " + (baru.allData.length - baru.size));
                    };
                    break;
                case 4:
                    baru.print();
                    break;
                case 5:
                    baru.clear();
                    break;
                case 6:
                    baru.dequeue();
                    break;
                case 7:
                    baru.peekFirst();
                    break;
                case 8:
                    baru.peekLast();
                    break;
                case 9:
                    System.out.println("Jumlah mahasiswa : " + baru.total());
                    break;
                case 0:
                    ulang = false;
            }
        } while (ulang);
        System.out.println("Terima kasih!");
    }
}
