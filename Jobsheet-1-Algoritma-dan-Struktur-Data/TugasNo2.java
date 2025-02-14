import java.util.Scanner;

public class TugasNo2 {

    static int volumeKubus(int s) {
        int volume = s * s * s;
        return volume;
    }

    static int luasPermukaanKubus(int sisi) {
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }

    static int kelilingKubus(int s) {
        int keliling = 12 * s;
        return keliling;
    }

    public static void main(String[] args) {
        boolean status = true;
    
        while (status) {
            Scanner scan = new Scanner(System.in);
            byte menu;
            int sisi;

            System.out.println("\nMenghitung Volume, Luas Permukaan, dan Keliling Kubus");
            System.out.println("=====================================================\n");
            System.out.println("1. Volume Kubus");
            System.out.println("2. Luas Permukaan Kubus");
            System.out.println("3. Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("\nPilih Menu : ");
            menu = scan.nextByte();

            switch (menu) {
                case 1:
                    System.out.println("\n - Menghitung Volume Kubus - \n");
                    System.out.print("Masukkan panjang sisi kubus : ");
                    sisi = scan.nextInt();
                    System.out.println("Volume kubus dengan panjang sisi " + sisi + " adalah " + volumeKubus(sisi));
                    continue;
                case 2:
                    System.out.println("\n - Menghitung Luas Permukaan Kubus - \n");
                    System.out.print("Masukkan panjang sisi kubus : ");
                    sisi = scan.nextInt();
                    System.out.println(
                            "Luas permukaan kubus dengan panjang sisi " + sisi + " adalah " + luasPermukaanKubus(sisi));
                    continue;
                case 3:
                    System.out.println("\n - Menghitung Keliling Kubus - \n");
                    System.out.print("Masukkan panjang sisi kubus : ");
                    sisi = scan.nextInt();
                    System.out.println("Keliling kubus dengan panjang sisi " + sisi + " adalah " + kelilingKubus(sisi));
                    continue;
                case 4:
                    System.out.println("\nTerima kasih.");
                    status = false;
                default:
                    System.out.println("\nMenu tidak tersedia.");
            }
        }
    }
}
