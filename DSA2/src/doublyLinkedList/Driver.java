package doublyLinkedList;

public class Driver {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.traverse();
//        list.addFirst(0);
//        list.addFirst(-10);
//        list.removeFirst();
//        list.addFirst(0);
        list.addAt(1,50);
        list.traverse();
    }
}
