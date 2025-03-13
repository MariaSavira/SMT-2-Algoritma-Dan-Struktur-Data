import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = scan.nextInt();
        System.out.println();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF : " + Faktorial.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC : " + Faktorial.faktorialDC(nilai));
    }
}