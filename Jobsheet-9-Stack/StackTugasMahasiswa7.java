public class StackTugasMahasiswa7 {
    Mahasiswa7 stack[];
    int size;
    int top;
    int brpBanyak;

    public StackTugasMahasiswa7(int size) {
        this.size = size;
        stack = new Mahasiswa7[size];
        top = -1;
        brpBanyak = 0;
    }

    boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Mahasiswa7 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    Mahasiswa7 pop() {
        if (!isEmpty()) {
            Mahasiswa7 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    Mahasiswa7 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    Mahasiswa7 peekBottom(){
        if (!isEmpty()) {
            return stack[0];
        } else {
            return null;
        }
    }

    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    int hitungBerapaBanyak(){
        if (!isEmpty()){
            return top + 1;
        } else {
            return 0;
        }
    }
}
