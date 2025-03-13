import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int elemen = scan.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++){
            System.out.print("Masukkan nilai basis elemen ke-" + (i + 1) + " : ");
            int basis = scan.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i + 1) + " : ");
            int pangkat = scan.nextInt();

            png[i] = new Pangkat(basis, pangkat);
        }
        System.out.println("\nHASIL PANGKAT BRUTE FORCE : ");
        for (Pangkat p : png){
            System.out.println(p.nilai + "^" + p.pangkat + " : " + p.pangkatBF());
        }
        System.out.println("\nHASIL PANGKAT DIVIDE AND CONQUER : ");
        for (Pangkat p : png){
            System.out.println(p.nilai + "^" + p.pangkat + " : " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
