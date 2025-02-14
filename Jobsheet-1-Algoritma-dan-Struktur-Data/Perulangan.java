import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String NIM;

        /*NIM saya = 244107060144 */
        System.out.print("Masukkan NIM Anda (12 Karakter) : ");
        NIM = scan.nextLine();

        int duaDigitTerakhir = Integer.parseInt(NIM.substring(10,12));
        int n = duaDigitTerakhir;

        System.out.println("NIM Anda : " + n);

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0){
                System.out.print("* ");
            } else if (i == 6 || i == 10){
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
