package linkedList;

// Ex: List -> 10,20,1,45,3,66,12,40
// k = 3
// O/P = 66

public class KthElementFromEnd {

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addLast(12);
        linkedList.addLast(2);
        linkedList.addLast(40);
        linkedList.addLast(33);
        linkedList.addLast(45);
        linkedList.addLast(53);
        linkedList.addLast(99);
        linkedList.addLast(10);
        int k = 5;

        System.out.println(kThElement(linkedList, k));
    }

    private static int kThElement(MyLinkedList list, int k) {

        Node slow = list.head;
        // for k+1
        Node prev = null;
        Node fast = list.head;

        // give fast a head start by k
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        // slow and fast both start moving together until fast is not null
        while (fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        // for k+1
        System.out.println(prev.data);
        return slow.data;

    }


}
