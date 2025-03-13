public class Nilai {
    String nama;
    String NIM;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    Nilai(String nama, String NIM, int tahunMasuk, int nilaiUTS, int nilaiUAS){
        this.nama = nama;
        this.NIM = NIM;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    static int nilaiUTSTertinggi(int uts[], int l, int r){
        if (l == r){
            return uts[l];
        } else {
            int mid = (l+r)/2;
            int lmax = nilaiUTSTertinggi(uts, l, mid);
            int rmax = nilaiUTSTertinggi(uts, mid+1, r);

            if (lmax > rmax){
                return lmax;
            } else {
                return rmax;
            }
        }
    }

    static int nilaiUTSTerendah(int uts[], int l, int r){
        if (l == r){
            return uts[l];
        } else {
            int mid = (l + r) / 2;
            int lmin = nilaiUTSTerendah(uts , l, mid);
            int rmin = nilaiUTSTerendah(uts, mid+1, r);

            if (lmin < rmin){
                return lmin;
            } else {
                return rmin;
            }
        }
    }

    static int rataRataUTS(Nilai[] nilai){
        int total = 0;
        for (Nilai n : nilai){
            total += n.nilaiUTS;
        }
        return total / nilai.length; 
    }
}
