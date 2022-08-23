package linkedList.recursion;

import linkedList.Node;

public class ReverseLinkedListwithNodeAsInput {

    static Node headNode;
    static Node tailNode;

    public static void main(String[] args) {

        Node node1 = new Node(10);
        Node node2 = new Node(5);
        Node node3 = new Node(50);
        Node node4 = new Node(20);
        Node node5 = new Node(30);
        Node node6 = new Node(48);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = null;

        headNode = node1;
        traverse(headNode);

        reverse(headNode);
        headNode.next = null;
        headNode = tailNode;
        traverse(headNode);
    }

    private static void reverse(Node temp){
        if(temp == null)
            return;

        reverse(temp.next);

        // checking if temp is a tail node or not
        if(temp.next!=null)
        {
            temp.next.next = temp;
        }
        else {
            tailNode = temp;
        }
    }

    public static void traverse(Node temp){

        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
