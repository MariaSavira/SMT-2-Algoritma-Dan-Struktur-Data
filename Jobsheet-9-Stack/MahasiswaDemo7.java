import java.util.Scanner;

public class MahasiswaDemo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih;

        StackTugasMahasiswa7 stack = new StackTugasMahasiswa7(5);
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Melihat Jumlah Tugas Terkumpul");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa7 mhs = new Mahasiswa7(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n",
                    mhs.nama);
                    break;
                case 2:
                    Mahasiswa7 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas : "+ biner);
                    }
                    break;
                case 3:
                    Mahasiswa7 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa7 lihatTerbawah = stack.peekBottom();
                    if (lihatTerbawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + lihatTerbawah.nama);
                    }
                    break;
                case 6:
                    System.out.println("Banyak Tugas Terkumpul saat ini : " + stack.hitungBerapaBanyak());
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");

            }
        } while (pilih >= 1 && pilih <= 4);
    }

}
