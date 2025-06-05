package Pertemuan14;

public class BinaryTreeArrayMain07 {
    public static void main(String[] args) {
        BinaryTreeArray07 bta = new BinaryTreeArray07();

        Mahasiswa00 mhs1 = new Mahasiswa00("244160121", "Ali", "A", 3.57);
        Mahasiswa00 mhs2 = new Mahasiswa00("244160185", "Candra", "C", 3.41);
        Mahasiswa00 mhs3 = new Mahasiswa00("244160221", "Badar", "B", 3.75);
        Mahasiswa00 mhs4 = new Mahasiswa00("244160220", "Dewi", "B", 3.35);
        Mahasiswa00 mhs5 = new Mahasiswa00("244160131", "Devi", "A", 3.48);
        Mahasiswa00 mhs6 = new Mahasiswa00("244160205", "Ehsan", "D", 3.61);
        Mahasiswa00 mhs7 = new Mahasiswa00("244160170", "Fizi", "B", 3.86);

        Mahasiswa00[] dataMahasiswas = new Mahasiswa00[15];
        dataMahasiswas[0] = mhs1;
        dataMahasiswas[1] = mhs2;
        dataMahasiswas[2] = mhs3;
        dataMahasiswas[3] = mhs4;
        dataMahasiswas[4] = mhs5;
        dataMahasiswas[5] = mhs6;
        dataMahasiswas[6] = mhs7;

        int idxLast = 6;
        bta.populateData(dataMahasiswas, idxLast);

        System.out.println("\nInorder Traversal Mahasiswa:");
        bta.traverseInOrder(0);

        bta.add(new Mahasiswa00("01", "Ani", "TI-1A", 3.2));
        bta.add(new Mahasiswa00("02", "Budi", "TI-1A", 3.6));
        bta.add(new Mahasiswa00("03", "Cici", "TI-1A", 2.9));
        bta.add(new Mahasiswa00("04", "Dani", "TI-1A", 3.8));

        System.out.println("\nPre-Order Traversal Mahasiswa:");
        bta.traversePreOrder(0);
    }
}
