public class DataDosen07 {
    Dosen07 [] dataDosen = new Dosen07[5];
    int idx;

    void tambah(Dosen07 d){
        if (idx < dataDosen.length){
            dataDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (Dosen07 d : dataDosen){
            d.tampil();
            System.out.println("-------------------");
        }
    }

    void SortingASC(){
        Dosen07 temp;
        for (int i = 0; i < dataDosen.length - 1; i++){
            for (int j = 1; j < dataDosen.length - i; j++){
                if (dataDosen[j].usia < dataDosen[j - 1].usia){
                    temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = temp;
                }   
            }
        }
    }

    void SortingDSC(){
        for (int i = 0; i < dataDosen.length - 1; i++){
            int idxMin = i;
            for (int j = i + 1; j < dataDosen.length; j++){
                if (dataDosen[j].usia > dataDosen[idxMin].usia) {
                    idxMin = j;
                }
            }
            Dosen07 tmp = dataDosen[idxMin];
            dataDosen[idxMin] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen07 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}
