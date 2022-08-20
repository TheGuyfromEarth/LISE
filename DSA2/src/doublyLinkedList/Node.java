package doublyLinkedList;

public class Node {

    int data;
    Node previous;
    Node next;

    public Node(int val){
        this.data = val;
        previous = next = null;
    }
}
