package Pertemuan12;
import java.util.Scanner;

public class SLLMain7 {
    public static void main(String[] args) {
        SingleLinkedList7 sll = new SingleLinkedList7();
        Scanner scan = new Scanner(System.in);
        int pilih = 0;

        Mahasiswa7 mhs1 = new Mahasiswa7("101", "Maria", "SIB-1A", 3.75);
        Mahasiswa7 mhs2 = new Mahasiswa7("102", "Savira", "SIB-1B", 3.65);
        Mahasiswa7 mhs3 = new Mahasiswa7("103", "Sasa", "SIB-1C", 3.90);
        Mahasiswa7 mhs4 = new Mahasiswa7("104", "Marsha", "SIB-1D", 3.55);

        do {
            System.out.println("Pilih menu : ");
            System.out.println("1. Input");
            System.out.println("Pilih menu : ");
            System.out.println("Pilih menu : ");
        }
        while (pilih == 0);
            System.out.println("Terima kasih!");

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addFirst(mhs1);
        sll.print();
        sll.insertAfter("Marsha", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
