package dll;
public class Node01 {
    Mahasiswa01 data;
    Node01 prev;
    Node01 next;

    public Node01(Node01 prev, Mahasiswa01 data, Node01 next) {
        this.prev = null;
        this.data = data;
        this.next = null;
    }
}
