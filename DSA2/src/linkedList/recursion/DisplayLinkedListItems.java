package linkedList.recursion;

// list -> 12 44 78 11 59 39 20

import linkedList.MyLinkedList;
import linkedList.Node;

public class DisplayLinkedListItems {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.addLast(12);
        list.addLast(44);
        list.addLast(78);
        list.addLast(11);
        list.addLast(59);
        list.addLast(20);
//        print(list);
        printReverse(list);
    }


    public static void print(MyLinkedList list){
        printHelper(list.getHead());
    }
    private static void printHelper(Node temp){
        if(temp == null)
            return;
        System.out.print(temp.data+" ");
        printHelper(temp.next);
    }


    public static void printReverse(MyLinkedList list){
        printReverseHelper(list.getHead());
    }

    private static void printReverseHelper(Node temp){
        if(temp == null)
            return;

        printReverseHelper(temp.next);
        System.out.print(temp.data+" ");
    }
}
