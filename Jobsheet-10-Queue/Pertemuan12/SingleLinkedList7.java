package Pertemuan12;

public class SingleLinkedList7 {
    NodeMahasiswa7 head;
    NodeMahasiswa7 tail;

    public boolean isEmpty(){
        return head == null;
    }

    public void print(){
        if (!isEmpty()){
            NodeMahasiswa7 tmp = head;
            System.out.println("Isi Linked List : \t");
            while (tmp != null){
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong!");
        }
    }

    public void addFirst(Mahasiswa7 input){
        NodeMahasiswa7 ndInput = new NodeMahasiswa7(input, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa7 input){
        NodeMahasiswa7 ndInput = new NodeMahasiswa7(input, null);
        if (!isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa7 input){
        NodeMahasiswa7 ndInput = new NodeMahasiswa7(input, null);
        NodeMahasiswa7 temp = head;

        do {
            if (temp.data.nama.equalsIgnoreCase(key)){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null){
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
        while (temp != null);
    }

    public void insertAt(int index, Mahasiswa7 input){
        if (index < 0){
            System.out.println("Indeks salah");
        } else if (index == 0){
            addFirst(input);
        } else {
            NodeMahasiswa7 temp = head;
            for (int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa7(input, temp.next);
            if (temp.next.next == null){
                tail = temp.next;
            }
        }
    }
}
