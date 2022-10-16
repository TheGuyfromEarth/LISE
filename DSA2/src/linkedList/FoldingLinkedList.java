
public class FoldingLinkedList {

    static Node left;
    static int size = 0;

    public static void main(String[] args) {
        Node head = createLinkedList();
        left = head;
        traverse(head);
        System.out.println();
        Node newHead = foldLinkedList(head, 0);
        traverse(newHead);

    }

    public static Node foldLinkedList(Node node, int count) {
        if (node == null) {
            size = count;
            return null;
        }
        foldLinkedList(node.next, count + 1);

        if (count > size / 2) {
            node.next = left.next;
            left.next = node;
            left = node.next;
        }
        if (count == size / 2) {
            node.next = null;
            if((size&1) == 0)
                left.next = node;
        }

        return node;
    }

    public static Node createLinkedList() {
        Node head = new Node(10);
        Node temp = new Node(20);
        Node temp1 = new Node(50);
        Node temp2 = new Node(30);
        Node temp3 = new Node(90);
        head.next = temp;
        temp.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        return head;
    }

    public static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}