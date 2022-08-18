package linkedList;

// cannot use size

public class MiddleOfLinkedList {

    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addLast(12);
        linkedList.addLast(2);
        linkedList.addLast(40);
        linkedList.addLast(33);
        linkedList.addLast(45);
        linkedList.addLast(10);

        System.out.println(findMiddleElement(linkedList));
    }

    private static int findMiddleElement(MyLinkedList list) {

        Node slow = list.head;
        Node fast = list.head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.data;
    }

}
