package Tugas;

public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int jmlDilayani = 0;

    public AntrianKRS(int max){
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void clear(){
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa mhs){
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian");
    }

    public Mahasiswa layaniMahasiswa(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        }
        Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public void prosesKRS2Mahasiswa() {
        if (size < 2) {
            System.out.println("Minimal 2 mahasiswa dibutuhkan untuk memproses KRS.");
            return;
        }
    
        System.out.println("Memproses KRS untuk 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa mhs = layaniMahasiswa();
            System.out.print(" - ");
            mhs.tampilkanData();
            jmlDilayani++;
        }
    }

    public void tampilkanSemua(){
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i+1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihat2Terdepan(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = front; i < front+2; i++) {
                data[i].tampilkanData();
            }
        }
    }

    public void lihatAkhir(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian(){
        return size;
    }

    public int getJmlDilayani(){
        return jmlDilayani;
    }

    public int getSisaLayanan(){
        return 30 - jmlDilayani;
    }
}