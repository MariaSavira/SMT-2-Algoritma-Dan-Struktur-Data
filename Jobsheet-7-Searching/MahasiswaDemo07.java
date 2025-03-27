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
        
        list.tampil();
        System.out.println("\n-----------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-----------------------------------");
        System.out.print("\nMasukkan IPK mahasiswa yang dicari : ");
        double cari = scan.nextDouble();

        System.out.println("\nMenggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}
