package linkedList;

public class Driver {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(5);
        myLinkedList.add(100);
        myLinkedList.add(50);
        myLinkedList.addFirst(95);
        myLinkedList.traverse();

    }
}
