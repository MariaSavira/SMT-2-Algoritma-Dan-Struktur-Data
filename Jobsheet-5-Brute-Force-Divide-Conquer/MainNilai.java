public class MainNilai {
    public static void main(String[] args) {
        Nilai[] nilai = new Nilai[8];
        
        nilai[0] = new Nilai("Ahmad", "220101001", 2022, 78, 82);
        nilai[1] = new Nilai("Budi", "220101002", 2022, 85, 88);
        nilai[2] = new Nilai("Cindy", "220101003", 2021, 90, 87);
        nilai[3] = new Nilai("Dian", "220101004", 2021, 76, 79);
        nilai[4] = new Nilai("Eko", "220101005", 2023, 92, 95);
        nilai[5] = new Nilai("Fajar", "220101006", 2020, 88, 85);
        nilai[6] = new Nilai("Gina", "220101007", 2023, 80, 83);
        nilai[7] = new Nilai("Hadi", "220101008", 2020, 82, 84);

        System.out.println("Data Nilai Mahasiswa");
        System.out.println();
        System.out.println("Nama\tNIM\t\tTahun\tNilai UTS\tNilai UAS");
        for (Nilai n : nilai){
            System.out.println(n.nama + "\t" + n.NIM + "\t" + n.tahunMasuk + "\t" + n.nilaiUTS + "\t\t" + n.nilaiUAS);
        }

        int utsArray[] = new int[nilai.length];

        for (int i = 0; i < nilai.length; i++){
            utsArray[i] = nilai[i].nilaiUTS;
        }

        System.out.println("\nNilai UTS Tertinggi : " + Nilai.nilaiUTSTertinggi(utsArray, 0, utsArray.length-1));
        System.out.println("Nilai UTS Terendah : " + Nilai.nilaiUTSTerendah(utsArray, 0, utsArray.length-1));
        System.out.println("\nRata-rata UTS : " + Nilai.rataRataUTS(nilai));
    }
}
