import java.util.Formatter;
import java.util.Scanner;

public class TugasNo3 {
    static Scanner scan = new Scanner(System.in);
    static int n;
    static String[] matkul;
    static int[] sks;
    static int[] semester;
    static String[] hari;

    static void jadwalKuliah() {
        Formatter fr = new Formatter();
        int menu;

        System.out.println("\nJadwal Kuliah");
        System.out.println("================================\n");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "Mata Kuliah : ", "SKS : ", "Semester : ", "Hari : ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-10s %-10s %-10s\n", matkul[i], sks[i], semester[i], hari[i]);
        }

        System.out.println(fr);
        System.out.println("================================");
        System.out.println("\n1. Tampilkan Jadwal Kuliah berdasarkan hari");
        System.out.println("2. Tampilkan Jadwal Kuliah berdasarkan semester");
        System.out.println("3. Kembali ke menu utama");
        System.out.print("\nPilih menu : ");
        menu = scan.nextInt();

        switch (menu) {
            case 1:
                tampilkanBerdasarkanHari();
                break;
            case 2:
                tampilkanBerdasarkanSemester();
                break;
            case 3:
                return;
        }
    }

    static void tampilkanBerdasarkanHari() {
        Formatter fr = new Formatter();
        String inputHari;
        boolean pilihHari[] = new boolean[n];

        System.out.print("\nMasukkan hari : ");
        inputHari = scan.next();
        int addHari = 0;

        for (int i = 0; i < n; i++) {
            if (inputHari.equalsIgnoreCase(hari[i])) {
                pilihHari[i] = true;
                addHari++;
            }
        }

        System.out.println("\nJadwal Kuliah hari " + inputHari);
        System.out.println("================================\n");

        if (addHari == 0) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + inputHari);
        } else {
            System.out.printf("%-20s %-10s %-10s %-10s\n", "Mata Kuliah : ", "SKS : ", "Semester : ", "Hari : ");
        }

        for (int i = 0; i < n; i++) {
            if (pilihHari[i]) {
                System.out.printf("%-20s %-10s %-10s %-10s\n", matkul[i], sks[i], semester[i], hari[i]);
            }
        }

        System.out.println("================================\n");
        System.out.print("Apakah ingin kembali? (y/n) : ");
        char kembali = Character.toLowerCase(scan.next().charAt(0));

        if (kembali == 'y') {
            jadwalKuliah();
        } else if (kembali == 'n') {
            tampilkanBerdasarkanHari();
        }
    }

    static void tampilkanBerdasarkanSemester() {
        Formatter fr = new Formatter();
        int inputSemester;
        boolean pilihSemester[] = new boolean[n];

        int addSemester = 0;
        System.out.print("\nMasukkan semester : ");
        inputSemester = scan.nextInt();

        for (int i = 0; i < n; i++) {
            if (inputSemester == semester[i]) {
                pilihSemester[i] = true;
                addSemester++;
            }
        }

        System.out.println("\nJadwal Kuliah semester " + inputSemester);
        System.out.println("================================\n");

        if (addSemester == 0) {
            System.out.println("Tidak ada jadwal kuliah pada semester " + inputSemester);
        } else {
            System.out.printf("%-20s %-10s %-10s %-10s\n", "Mata Kuliah : ", "SKS : ", "Semester : ", "Hari : ");
        }

        for (int i = 0; i < n; i++) {
            if (pilihSemester[i]) {
                System.out.printf("%-20s %-10s %-10s %-10s\n", matkul[i], sks[i], semester[i], hari[i]);
            }
        }

        System.out.println("================================\n");
        System.out.print("Apakah ingin kembali? (y/n) : ");
        char kembali = Character.toLowerCase(scan.next().charAt(0));

        if (kembali == 'y') {
            jadwalKuliah();
        } else if (kembali == 'n') {
            tampilkanBerdasarkanSemester();
        }

    }

    static void cariMatkul() {
        String inputMatkul;
        int index = 0;
        boolean matkulFound = false;
        char kembali = 'n';

        System.out.print("\nMasukkan nama mata kuliah : ");
        scan.nextLine();
        inputMatkul = scan.nextLine();

        for (int i = 0; i < n; i++) {
            index = 0;
            if (inputMatkul.equalsIgnoreCase(matkul[i])) {
                index = i;
                matkulFound = true;
            }
        }

        if (matkulFound){
            System.out.println("\nInformasi Mata Kuliah : " + inputMatkul + "\n");
            System.out.println("================================");
            System.out.println("Mata Kuliah : " + matkul[index]);
            System.out.println("SKS : " + sks[index]);
            System.out.println("Semester : " + semester[index]);
            System.out.println("Hari : " + hari[index]);
            System.out.println("================================\n");
        } else if (!matkulFound) {
            System.out.println("\nMata kuliah tidak ditemukan.\n");
        }

        System.out.print("Apakah ingin kembali? (y/n) : ");
        kembali = Character.toLowerCase(scan.next().charAt(0));

        if (kembali == 'y') {
            return;
        } else if (kembali == 'n') {
            cariMatkul();
        }
    }

    public static void main(String[] args) {
        System.out.println("Aplikasi Pencatat Jadwal Kuliah");
        System.out.println("================================\n");
        System.out.print("Masukkan jumlah mata kuliah : ");
        n = scan.nextInt();

        matkul = new String[n];
        sks = new int[n];
        semester = new int[n];
        hari = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nMasukkan nama mata kuliah ke-" + (i + 1) + " : ");
            scan.nextLine();
            matkul[i] = scan.nextLine();
            System.out.print("Masukkan jumlah SKS mata kuliah ke-" + (i + 1) + " : ");
            sks[i] = scan.nextInt();
            System.out.print("Masukkan semester mata kuliah ke-" + (i + 1) + " : ");
            semester[i] = scan.nextInt();
            System.out.print("Masukkan hari mata kuliah ke-" + (i + 1) + " : ");
            hari[i] = scan.next();
        }

        boolean status = true;

        while (status) {
            System.out.println("\nMenu");
            System.out.println("1. Tampilkan Jadwal Kuliah");
            System.out.println("2. Cari Mata Kuliah");
            System.out.println("3. Keluar");
            System.out.print("\nPilih menu : ");
            int menu = scan.nextInt();

            switch (menu) {
                case 1:
                    jadwalKuliah();
                    continue;
                case 2:
                    cariMatkul();
                    continue;
                case 3:
                    System.out.println("\nTerima kasih.");
                    status = false;
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }
    }
}
