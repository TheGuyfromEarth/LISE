package linkedList;

public class MyLinkedList {
    Node head;
    Node tail;
    int size;

    public void add(int data) {

        Node temp = new Node(data);

        // if list is empty
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public void traverse(){
        Node temp = head;

        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void addFirst(int data){
        Node temp = new Node(data);

        if(head == null){
            head = tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void addLast(int data){

    }

    public void removeFirst(){

    }

    public void removeLast(){

    }

    public int get(int index){

        return -1;
    }
}
