import java.util.Scanner;

public class MahasiswaDemo07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah data mahasiswa : ");
        int jml = scan.nextInt();
        System.out.println();

        MahasiswaBerprestasi07 list = new MahasiswaBerprestasi07(jml);

        for (int i = 0; i < jml; i++){
            System.out.println("Data ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = scan.next();
            System.out.print("Nama  : ");
            String nama = scan.next();
            System.out.print("Kelas : ");
            String kelas = scan.next();
            System.out.print("IPK   : ");
            double ipk = scan.nextDouble();
            System.out.println();
            list.tambah(list.listMhs[i] = new Mahasiswa07(nim, nama, kelas, ipk));
        }
        
        System.out.println("Data Mahasiswa sebelum sorting");
        list.tampil();

        System.out.println();
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (BUBBLE SORT DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println();
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (SELECTION SORT ASC) : ");
        list.selectionSort();
        list.tampil();
    }
}
