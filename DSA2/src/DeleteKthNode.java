package circularLinkedList;

public class DeleteKthNode {

    // class Node
// {
//     int data;
//     Node next;
//     Node(int x)
//     {
//         data = x;
//         next = null;
//     }
// }

    static Node deleteK(Node head, int k) {

        Node temp = head;

        if (temp == null)
            return null;

        printList(head);
        while (true) {

            if (head.next == head)
                break;

            for (int i = 0; i < k - 1; i++) {
                temp = temp.next;
            }

            if (temp.next == head) {
                Node curr = head;
                while (curr.next != head) {
                    curr = curr.next;
                }
                Node headNext = head.next;
                curr.next = headNext;
                head = headNext;
            } else {
                temp.next = temp.next.next;
            }
            printList(head);
        }
        return head;
    }

    static void printList(Node head) {
        Node temp = head;
        do{
            System.out.print(temp.data+"->");
            temp = temp.next;
        }while(temp!=head);
        System.out.println(temp.data);
    }
}
