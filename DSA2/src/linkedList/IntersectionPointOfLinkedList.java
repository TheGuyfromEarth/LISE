package linkedList;


public class IntersectionPointOfLinkedList {

    public static void main(String[] args) {
        MyLinkedList linkedList1 = new MyLinkedList();
        linkedList1.addLast(12);
        linkedList1.addLast(34);
        linkedList1.addLast(33);

        MyLinkedList linkedList2 = new MyLinkedList();
        linkedList2.addLast(89);
        linkedList2.addLast(64);

        Node node1 = new Node(1);

        linkedList1.addNodeAtEnd(node1);
        linkedList2.addNodeAtEnd(node1);

        Node node2 = new Node(75);

        linkedList1.addNodeAtEnd(node2);
        linkedList2.addNodeAtEnd(node2);


        Node node3 = new Node(22);

        linkedList1.addNodeAtEnd(node3);
        linkedList2.addNodeAtEnd(node3);

        System.out.println(findIntersection(linkedList1, linkedList2));
    }

    private static int findIntersection(MyLinkedList list1, MyLinkedList list2) {

        int size1 = list1.size;
        int size2 = list2.size;

        int diff = Math.abs(size1 - size2);

        Node temp1 = list1.head;
        Node temp2 = list2.head;

        // list1 is having more elements
        if (size1 > size2) {
            for (int i = 0; i < diff; i++)
                temp1 = temp1.next;
        } else {
            for (int i = 0; i < diff; i++)
                temp2 = temp2.next;
        }

        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1.data;
    }
}
