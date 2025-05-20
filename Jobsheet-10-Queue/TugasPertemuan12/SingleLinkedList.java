package TugasPertemuan12;

public class SingleLinkedList {
    NodeMahasiswa7[] allData;
    NodeMahasiswa7 front;
    NodeMahasiswa7 rear;
    int size = 0;
    int max;

    public SingleLinkedList(int max) {
        this.max = max;
        allData = new NodeMahasiswa7[max];
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public int total() {
        NodeMahasiswa7 saatIni = front;
        int sizeLocal = 0;
        while (saatIni != null) {
            sizeLocal++;
            size = sizeLocal;
            saatIni = saatIni.next;
        }
        return size;
    }

    public boolean isFull() {
        total();
        return (size == max);
    }

    public void enqueue(String nim, String nama, String kelas) {
        Mahasiswa7 inputMhs = new Mahasiswa7(nim, nama, kelas);
        NodeMahasiswa7 inputNode = new NodeMahasiswa7(inputMhs, null);
        if (isFull()) {
            System.out.println("Antrian sudah penuh!");
            return;
        } else if (isEmpty()) {
            front = inputNode;
            rear = inputNode;
        } else {
            rear.next = inputNode;
            rear = inputNode;
        }
        allData[size] = inputNode;
        if (isFull()){
            return;
        } else {
            size++;
        }
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
        for (int i = 0; i < max; i++) {
            allData[i] = null;
        }
        System.out.println("Antrian berhasil dikosongkan!");
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            NodeMahasiswa7 saatIni = front;
            while (saatIni != null) {
                saatIni.data.tampilData();
                saatIni = saatIni.next;
            }
            System.out.println();
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Menghapus antrian : ");
            front.data.tampilData();

            for (int i = 0; i < size - 1; i++) {
                allData[i] = allData[i + 1];
            }
            allData[size - 1] = null;

            front = front.next;
            size--;
            if (front == null)
                rear = null;
        }
    }

    public void peekFirst() {
        System.out.println("Antrian Pertama : ");
        front.data.tampilData();
    }

    public void peekLast() {
        System.out.println("Antrian Terakhir : ");
        rear.data.tampilData();
    }
}
