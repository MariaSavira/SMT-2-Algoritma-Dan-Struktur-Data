import java.util.Scanner;

public class MatakuliahDemo07{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah matakuliah : ");
        int index = scan.nextInt();
        Matakuliah07[] arrayOfMatakuliah = new Matakuliah07[index];

        Matakuliah07.tambahData(arrayOfMatakuliah);
        Matakuliah07.cetakInfo(arrayOfMatakuliah);
    }
}