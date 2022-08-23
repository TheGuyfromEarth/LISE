package linkedList.recursion;

// by recursion only

import linkedList.MyLinkedList;
import linkedList.Node;

public class ReversetheLinkedList {

//    static Node tailNode;

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.addLast(32);
        list.addLast(67);
        list.addLast(78);
        list.addLast(1);
        list.addLast(10);
        list.traverse();
        System.out.println();
        reverse(list);
        list.traverse();
    }
    public static void reverse(MyLinkedList list){
//        tailNode = list.getTail();
        reverseHelper(list.getHead());

        list.getHead().next = null;

        Node temp = list.getHead();
        list.setHead(list.getTail());
        list.setTail(temp);
    }

    private static void reverseHelper(Node temp){
        if(temp == null)
            return;

        reverseHelper(temp.next);

        // checking if temp is a tail node or not
        if(temp.next!=null)
        {
            temp.next.next = temp;
        }
    }
}
