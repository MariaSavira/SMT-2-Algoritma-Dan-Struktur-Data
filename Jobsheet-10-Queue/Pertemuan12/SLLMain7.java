package Pertemuan12;
import java.util.Scanner;

public class SLLMain7 {
    public static void main(String[] args) {
        SingleLinkedList7 sll = new SingleLinkedList7();
        Scanner scan = new Scanner(System.in);
        int pilih = 0;
        String nim = "";
        String nama = "";
        String kelas = "";
        String key = "";
        int indeks = 0;
        double ipk = 0;

        boolean ulang = true;
        do {
            System.out.println("\n1. Input data pertama");
            System.out.println("2. Input data terakhir");
            System.out.println("3. Input data setelah... ");
            System.out.println("4. Input data pada indeks ke... ");
            System.out.println("5. Print Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = scan.nextInt();
            scan.nextLine();
            System.out.println("");

            switch (pilih){
                case 1:
                    System.out.print("NIM : ");
                    nim = scan.nextLine();
                    System.out.print("Nama : ");
                    nama = scan.nextLine();
                    System.out.print("Kelas : ");
                    kelas = scan.nextLine();
                    System.out.print("IPK : ");
                    ipk = scan.nextDouble();
                    sll.addFirst(new Mahasiswa7(nim, nama, kelas, ipk));
                    break;
                case 2:
                    System.out.print("NIM : ");
                    nim = scan.nextLine();
                    System.out.print("Nama : ");
                    nama = scan.nextLine();
                    System.out.print("Kelas : ");
                    kelas = scan.nextLine();
                    System.out.print("IPK : ");
                    ipk = scan.nextDouble();
                    sll.addLast(new Mahasiswa7(nim, nama, kelas, ipk));
                    break;
                case 3:
                    System.out.print("Tambah setelah nama : ");
                    key = scan.nextLine();
                    System.out.println("");
                    System.out.print("NIM : ");
                    nim = scan.nextLine();
                    System.out.print("Nama : ");
                    nama = scan.nextLine();
                    System.out.print("Kelas : ");
                    kelas = scan.nextLine();
                    System.out.print("IPK : ");
                    ipk = scan.nextDouble();
                    sll.insertAfter(key, new Mahasiswa7(nim, nama, kelas, ipk));
                    break;
                case 4:
                    System.out.print("NIM : ");
                    nim = scan.nextLine();
                    System.out.print("Nama : ");
                    nama = scan.nextLine();
                    System.out.print("Kelas : ");
                    kelas = scan.nextLine();
                    System.out.print("IPK : ");
                    ipk = scan.nextDouble();
                    System.out.print("\nTambah pada indeks  : ");
                    indeks = scan.nextInt();
                    sll.insertAt(indeks, new Mahasiswa7(nim, nama, kelas, ipk));
                    break;
                case 5:
                    sll.print();
                    break;
                case 0:
                    ulang = false;
            }
        }
        while (ulang);
            System.out.println("Terima kasih!");
    }
}
