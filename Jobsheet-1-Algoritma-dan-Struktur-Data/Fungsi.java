import java.util.Formatter;

public class Fungsi {
    static int[][] stok = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5},
    {5, 7, 12, 9}};
    static String[] namaToko = {"Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};
    static String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    static int[] harga = {75000, 50000, 60000, 10000};

    public static void main(String[] args) {
        perkiraanPendapatan();
        jumlahStokSekarang();
    }

    static void perkiraanPendapatan(){
        Formatter fr = new Formatter();

        int[][] pendapatan = new int[4][4];

        for (int i = 0; i < stok.length; i++){
            for (int j = 0; j < stok[i].length; j++){
                pendapatan[i][j] = stok[i][j] * harga[j];
            }
        }
        for (int i = 0; i < stok.length; i++){
            fr.format("%-25s %-15s %-15s %-15s %-15s\n", "Nama Toko", "Aglonema", "Keladi",
            "Alocasia", "Mawar");

            fr.format("%-25s %-15s %-15s %-15s %-15s\n", namaToko[i], stok[i][0], stok[i][1],
            stok[i][2], stok[i][3]);

            fr.format("%-25s %-15s %-15s %-15s %-15s\n", "Pendapatan : ", pendapatan[i][0], pendapatan[i][1],
            pendapatan[i][2], pendapatan[i][3]);
            fr.format("\n");
        }
        System.out.println(fr);
    }

    static void jumlahStokSekarang(){
        Formatter frn = new Formatter();
        int[] tambah = {0, 0, 0, 0};
        int[] kurang = {-1, -2, -0, -5};

        System.out.println("==============================");
        System.out.println("Stok Tanaman Royal Garden 4 : \n");

        frn.format("%-25s %-15s %-15s %-15s %-15s\n", "Nama Bunga : ", "Stok Awal", "Bertambah",
        "Berkurang", "Stok Sekarang");

            for (int j = 0; j < stok[3].length; j++){
                frn.format("%-25s %-15s %-15s %-15s %-15s\n", namaBunga[j], stok[3][j], tambah[j],
                kurang[j], stok[3][j] + kurang[j] + tambah[j]);
            }
        
        System.out.println(frn);
    }
}
