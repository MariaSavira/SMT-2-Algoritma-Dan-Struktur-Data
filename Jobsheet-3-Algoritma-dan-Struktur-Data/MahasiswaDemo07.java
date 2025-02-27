import java.util.Scanner;

public class MahasiswaDemo07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mahasiswa07[] arrayOfMahasiswa = new Mahasiswa07[3];
        String dummy;

        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa07();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa[i].nim = scan.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa[i].nama = scan.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = scan.nextLine();
            System.out.print("IPK   : ");
            dummy = scan.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("=======================");
        }

        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM   : " + arrayOfMahasiswa[i].nim);
            System.out.println("Nama  : " + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas : " + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK   : " + arrayOfMahasiswa[i].ipk);
            System.out.println("==============================");
        }
    }
}
