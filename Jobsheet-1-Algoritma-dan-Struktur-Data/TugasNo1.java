import java.util.Scanner;
import java.util.Formatter;

public class TugasNo1 {
    public static void main(String[] args) {
        char[] platNomor = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char index;
        String hasil = "";
        char[][] namaKota = { { 'B', 'A', 'N', 'T', 'E', 'N' }, { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' }, { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' }, { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' } };

        Scanner scan = new Scanner(System.in);
        Formatter fr = new Formatter();

        System.out.print("Cek Kota Plat Nomor");
        System.out.println("\n===================");
        System.out.println("\nList Plat Nomor yang tersedia : ");

        for (int i = 0; i < platNomor.length; i++) {
            fr.format("%-5s", platNomor[i]);
        }
        System.out.print(fr + "\n");

        System.out.print("\nPilih plat nomor : ");
        index = Character.toUpperCase(scan.next().charAt(0));

        for (int i = 0; i < platNomor.length; i++) {
            if (platNomor[i] == (index)) {
                hasil = String.valueOf(namaKota[i]);
            }
        }

        String hasilTidakKapital = hasil.substring(1).toLowerCase();

        System.out.println("\nKota yang memiliki plat nomor " + index + " adalah " + hasil.substring(0, 1).toUpperCase()
                + hasilTidakKapital);
    }
}
