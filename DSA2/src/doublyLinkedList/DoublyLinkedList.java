package doublyLinkedList;

public class DoublyLinkedList {

    Node head;
    Node tail;
    int size;

    public void addLast(int val) {

        Node node = new Node(val);

        if (size == 0)
            head = tail = node;
        else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        size++;
    }

    public void addFirst(int val) {
        Node node = new Node(val);
        if (size == 0)
            head = tail = node;
        else {
            node.next = head;
            head.previous = node;
            head = node;
        }
        size++;
    }

    public void removeFirst(){
        if(size == 0)
            System.out.println("Error...list is empty");
        else if(size == 1) {
            head = tail = null;
            size--;
        }
        else{
            Node next = head.next;
            next.previous = null;
            head = next;
            size--;
        }
    }

    public void addAt(int index,int val){
        if(index <0 || index>size)
            System.out.println("Illegal Argument");
        else if(index == 0)
            addFirst(val);
        else if(index == size)
            addLast(val);
        else{
            Node node = new Node(val);
            Node temp = head;
            for(int i=0;i<index-1;i++){
                temp = temp.next;
            }
            Node tempNext = temp.next;
            node.previous = temp;
            node.next = tempNext;
            tempNext.previous = node;
            temp.next = node;
            size++;
        }
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
