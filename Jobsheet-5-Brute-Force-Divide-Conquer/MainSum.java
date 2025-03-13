import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int elemen = scan.nextInt();

        Sum sm = new Sum(elemen);
        for (int i = 0; i < elemen; i++){
            System.out.print("Masukkan nilai keuntungan ke-" + (i + 1) + " : ");
            sm.keuntungan[i] = scan.nextDouble();
        }
        System.out.println("\nTotal keuntungan menggunakan Bruteforce : " + sm.totalBF());
        System.out.println("\nTotal keuntungan menggunakan Divide and Conquer : " + sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}
