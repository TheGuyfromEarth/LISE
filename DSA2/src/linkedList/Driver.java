package linkedList;

public class Driver {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(10);
        myLinkedList.addLast(20);
        myLinkedList.addLast(5);
        myLinkedList.addLast(100);
        myLinkedList.addFirst(95);
//        myLinkedList.removeFirst();
//        myLinkedList.removeFirst();
//        myLinkedList.removeLast();
//        myLinkedList.removeLast();
        myLinkedList.traverse();
        System.out.println();
//        System.out.println(myLinkedList.getFirst());
//        System.out.println(myLinkedList.getLast());
//        System.out.println(myLinkedList.get(3));
//        myLinkedList.addAtIndex(200,2);
        myLinkedList.removeAtIndex(2);
        myLinkedList.removeAtIndex(0);
        myLinkedList.traverse();
    }
}
