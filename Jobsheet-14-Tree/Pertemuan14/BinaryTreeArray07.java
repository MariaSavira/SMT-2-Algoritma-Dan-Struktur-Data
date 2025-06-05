package Pertemuan14;

public class BinaryTreeArray07 {
    Mahasiswa00[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray07() {
        this.dataMahasiswa = new Mahasiswa00[15];
    }

    public void add(Mahasiswa00 mhs) {
        if (idxLast < dataMahasiswa.length - 1) {
            idxLast++;
            dataMahasiswa[idxLast] = mhs;
        } else {
            System.out.println("Tree penuh!");
        }
    }

    public void traversePreOrder(int index) {
        if (index <= idxLast && dataMahasiswa[index] != null) {
            dataMahasiswa[index].tampilInformasi();
            traversePreOrder(2 * index + 1);
            traversePreOrder(2 * index + 2);
        }
    }

    void populateData(Mahasiswa00[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}
