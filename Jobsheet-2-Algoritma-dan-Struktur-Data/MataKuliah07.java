public class MataKuliah07{
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah07(String kodeMk, String nama, int sks, int jumlahJam){
        this.kodeMk = kodeMk;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi(){
        System.out.println("Kode MK : " + kodeMk);
        System.out.println("Nama MK : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println( "\nSKS berhasil dirubah");
    }

    void tambahJam(int jam){
        jumlahJam += jam;
        System.out.println("\nJam mata kuliah " + nama +" berhasil ditambah");
    }

    void kurangJam(int jam){
        if (jumlahJam < jam){
            System.out.println( "\nJam mata kuliah " + nama + " tidak bisa dikurangi karena jumlah jam tidak cukup");
        } else {
            jumlahJam -= jam;
            System.out.println("\nJam mata kuliah " + nama +" berhasil dikurangi");
        }
    }
}