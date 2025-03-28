public class DataDosen07 {
    Dosen07[] dataDosen = new Dosen07[5];
    int idx = 0;

    void tambah(Dosen07 d) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
            System.out.println("-------------------");
        }
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) { 
                    Dosen07 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    int[] PencarianDataSequential07(String cariNama) {
        int[] hasil = new int[idx]; 
        int ditemukan = 0;

        for (int i = 0; i < idx; i++) {
            if (cariNama.equalsIgnoreCase(dataDosen[i].nama)) {
                hasil[ditemukan] = i;
                ditemukan++;
            }
        }

        
        int[] hasilFix = new int[ditemukan];
        for (int i = 0; i < ditemukan; i++) {
            hasilFix[i] = hasil[i];
        }

        return hasilFix;
    }

    int[] PencarianDataBinary07(int cariUsia, int kiri, int kanan) {
        int[] hasil = new int[idx]; 
        int ditemukan = 0;

        while (kiri <= kanan) {
            int mid = (kiri + kanan) / 2;

            if (dataDosen[mid].usia == cariUsia) {
                
                hasil[ditemukan] = mid;
                ditemukan++;

                
                int left = mid - 1;
                while (left >= kiri && dataDosen[left].usia == cariUsia) {
                    hasil[ditemukan] = left;
                    ditemukan++;
                    left--;
                }

                
                int right = mid + 1;
                while (right <= kanan && dataDosen[right].usia == cariUsia) {
                    hasil[ditemukan] = right;
                    ditemukan++;
                    right++;
                }
                break;
            } else if (dataDosen[mid].usia > cariUsia) {
                kanan = mid - 1;
            } else {
                kiri = mid + 1;
            }
        }

        
        int[] hasilFix = new int[ditemukan];
        for (int i = 0; i < ditemukan; i++) {
            hasilFix[i] = hasil[i];
        }

        return hasilFix;
    }

    void TampilkanDataDosen07(int[] hasil, String cari, int carii) {
        if (hasil.length == 0) {
            System.out.println("\nData tidak ditemukan.");
        } else {
            if (cari != null){
                System.out.println("\n" + hasil.length +" Data Nama " + cari +" ditemukan : " );   
            } else {
                System.out.println("\n" + hasil.length +" Data Usia " + carii +" ditemukan : " );   
            }
            for (int i = 0; i < hasil.length; i++) {
                dataDosen[hasil[i]].tampil();
            }
        }
    }
}
