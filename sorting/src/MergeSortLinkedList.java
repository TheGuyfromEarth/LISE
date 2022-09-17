class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class MergeSortLinkedList {

    public static void main(String[] args) {
        Node head = createLinkedList();
        traverse(head);
        Node res = mergeSort(head);
        traverse(res);
    }

    public static Node mergeSort(Node node) {
        Node resList = null;
        if (node == null || node.next == null) {
            return node;
        } else {
            Node middle = findMiddle(node);
            Node middleNext = middle.next;
            middle.next = null;
            Node node1 = mergeSort(node);
            Node node2 = mergeSort(middleNext);
            resList = merge(node1, node2);
        }
        return resList;
    }

    public static Node merge(Node node1, Node node2) {
        if (node1 == null && node2 != null)
            return node2;
        else if (node1 != null && node2 == null)
            return node1;
        else {
            Node res = null;
            if (node1.data <= node2.data) {
                res = node1;
                res.next = merge(node1.next, node2);
            } else {
                res = node2;
                res.next = merge(node1, node2.next);
            }
            return res;
        }
    }

    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node createLinkedList() {
        Node head = new Node(56);
        Node temp = addLast(33, head);
        Node temp1 = addLast(19, temp);
        Node temp2 = addLast(9, temp1);
        Node temp3 = addLast(92, temp2);
        Node temp4 = addLast(7, temp3);
        return head;
    }

    public static Node addLast(int val, Node prev) {
        Node node = new Node(val);
        prev.next = node;
        return prev.next;
    }
}
