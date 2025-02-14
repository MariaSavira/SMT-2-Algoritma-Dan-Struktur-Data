import java.util.Scanner;

public class Pemilihan{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        float nilaiAkhir = 0;
        String nilaiHuruf = "", keterangan = "";

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        do {
            System.out.print("\nMasukkan nilai Tugas: ");
            nilaiTugas = scan.nextInt();
            if (nilaiTugas < 0 || nilaiTugas > 100){
                System.out.println("Mohon isi dengan benar (0-100).");
            }
        } while (nilaiTugas < 0 || nilaiTugas > 100);

        do {
            System.out.print("Masukkan nilai Kuis : ");
            nilaiKuis = scan.nextInt();
            if (nilaiKuis < 0 || nilaiKuis > 100){
                System.out.println("Mohon isi dengan benar (0-100).");
            }
        } while (nilaiKuis < 0 || nilaiKuis > 100);

        do {
            System.out.print("Masukkan nilai UTS : ");
            nilaiUTS = scan.nextInt();
            if (nilaiUTS < 0 || nilaiUTS > 100){
                System.out.println("Mohon isi dengan benar (0-100).");
            }
        } while (nilaiUTS < 0 || nilaiUTS > 100);

        do {
            System.out.print("Masukkan nilai UAS : ");
            nilaiUAS = scan.nextInt();
            if (nilaiAkhir < 0 || nilaiAkhir > 100){
                System.out.println("Mohon isi dengan benar (0-100).");
            }
        } while (nilaiUAS < 0 || nilaiUAS > 100);

        System.out.println("\n==============================");

        nilaiAkhir += (nilaiTugas * 20 / 100) + (nilaiKuis * 20 / 100) + (nilaiUTS * 30 / 100) + (nilaiUAS * 30 / 100);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100){
            nilaiHuruf = "A";
            keterangan = "Lulus";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80){
            nilaiHuruf = "B+";
            keterangan = "Lulus";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73){
            nilaiHuruf = "B";
            keterangan = "Lulus";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65){
            nilaiHuruf = "C+";
            keterangan = "Lulus";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60){
            nilaiHuruf = "C";
            keterangan = "Lulus";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50){
            nilaiHuruf = "D";
            keterangan = "Tidak Lulus";
        } else if (nilaiAkhir <= 39){
            nilaiHuruf = "E";
            keterangan = "Tidak Lulus";
        }

        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
            if (keterangan.equals("Lulus")){
                System.out.println("Selamat, Anda dinyatakan " + keterangan);
            } else if (keterangan.equals("Tidak Lulus")){
                System.out.println("Mohon maaf, Anda dinyatakan " + keterangan);
            }
    }
}