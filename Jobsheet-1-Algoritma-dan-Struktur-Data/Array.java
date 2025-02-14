import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Formatter fr = new Formatter();
        DecimalFormat df = new DecimalFormat("#.##");

        String[] matkul = {"Kewarganegaraan", "Analisis Proses Bisnis", "Pengenalan Sistem Informasi",
                "Algoritma dan Struktur Data", "Praktikum Algoritma dan Struktur Data",
                "Basis Data", "Praktikum Basis Data", "Matematika Lanjut", "Sistem Operasi"};
        int[] sks = {2,2,2,2,2,2,2,2,2};
        String[] nilaiHuruf = new String[9];
        float[] nilai = new float[9];
        float[] bobot = new float[9];
        float total = 0f, totalSKS = 0f;
        float ipk = 0f;

        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================\n");

        for (int i = 0; i < nilai.length ; i++){
            do {
                System.out.print("Masukkan nilai MK " + matkul[i] + " : ");
                nilai[i] = scan.nextFloat();
                if (nilai[i] < 0 || nilai[i] > 100){
                    System.out.println("Mohon isi dengan benar (0-100).");
                }
            } while (nilai[i] < 0 || nilai[i] > 100);
        }

        for (int i = 0; i < matkul.length; i++){

            totalSKS += sks[i];

            if (nilai[i] > 80 && nilai[i] <= 100){
                nilaiHuruf[i] = "A";
                bobot[i] = 4.00f;
            } else if (nilai[i] > 73 && nilai[i] <= 80){
                nilaiHuruf[i] = "B+";
                bobot[i] = 3.50f;
            } else if (nilai[i] > 65 && nilai[i] <= 73){
                nilaiHuruf[i] = "B";
                bobot[i] = 3.00f;
            } else if (nilai[i] > 60 && nilai[i] <= 65){
                nilaiHuruf[i] = "C+";
                bobot[i] = 2.50f;
            } else if (nilai[i] > 50 && nilai[i] <= 60){
                nilaiHuruf[i] = "C";
                bobot[i] = 2.00f;
            } else if (nilai[i] > 39 && nilai[i] <= 50){
                nilaiHuruf[i] = "D";
                bobot[i] = 1.00f;
            } else if (nilai[i] <= 39) {
                nilaiHuruf[i] = "E";
                bobot[i] = 0;
            }

            total += (bobot[i] * sks[i]);
        }
        System.out.println("\n==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================\n");

        fr.format("%-40s %-15s %-15s %-15s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        fr.format("%-40s %-15s %-15s %-15s\n", "-----------", "-----------", "-----------", "-----------");

        for (int i = 0; i < matkul.length; i++){
            fr.format("%-40s %-15s %-15s %-15s\n", matkul[i], nilai[i], nilaiHuruf[i], bobot[i]);
        }

        System.out.println(fr);

        System.out.println(total);
        System.out.println(totalSKS);
        ipk = total / totalSKS;

        System.out.println("==============================");
        System.out.println("IPK : " + df.format(ipk));
    }
}
