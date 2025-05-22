package dll;

public class DoubleLinkedList {
    Node01 head;
    Node01 tail;
    int size = 0;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa01 data) {
        Node01 newNode = new Node01(null, data, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa01 data) {
        Node01 newNode = new Node01(null, data, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa01 data) {
        Node01 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node01 newNode = new Node01(null, data, null);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        Node01 current = head;
        if (current == null) {
            System.out.println("Linked list masih kosong");
        }
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public Node01 search(String keyNim) {
        boolean found = false;
        Node01 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
            if (current.data.nim.equals(keyNim)) {
                found = true;
            }
        }
        return current;
    }

    public void add(int index, Mahasiswa01 data) {
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node01 current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            addLast(data);
            return;
        }

        Node01 sebelum = current.prev;
        Node01 newNode = new Node01(sebelum, data, current);

        sebelum.next = newNode;
        current.prev = newNode;
        size++;
    }

    public void removeAfter(String keyNim) {
        Node01 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Node tidak ditemukan atau tidak ada node setelahnya.");
            return;
        }
        Node01 target = current.next;
        current.next = target.next;
        if (target.next != null) {
            target.next.prev = current;
        } else {
            tail = current;
        }
        System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus:");
        target.data.tampil();
        size--;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }
        Node01 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        System.out.println("Data di index ke-" + index + " berhasil dihapus:");
        current.data.tampil();
        size--;
    }

    public void getFirst() {
        if (!isEmpty())
            head.data.tampil();
        else
            System.out.println("List kosong");
    }

    public void getLast() {
        if (!isEmpty())
            tail.data.tampil();
        else
            System.out.println("List kosong");
    }

    public void getIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid.");
            return;
        }
        Node01 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data.tampil();
    }

    public int getSize() {
        return size;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        Node01 temp = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data sudah terhapus:");
        temp.data.tampil();
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        Node01 temp = tail;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data sudah terhapus:");
        temp.data.tampil();
        size--;
    }
}
