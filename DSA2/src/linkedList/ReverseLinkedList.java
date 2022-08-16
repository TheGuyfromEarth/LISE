package linkedList;

import java.awt.desktop.PreferencesEvent;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addLast(12);
        linkedList.addLast(2);
        linkedList.addLast(33);
        linkedList.addLast(45);

        linkedList.traverse();
        reverseLinkedList(linkedList);
        System.out.println();
        linkedList.traverse();
    }

    private static void reverseLinkedList(MyLinkedList list){

        Node prev = null;
        Node temp = list.head;

        while(temp!=null){
            Node tempNext = temp.next;
            temp.next = prev;
            prev = temp;
            temp = tempNext;
        }

        // swap head and tail
        Node tempNode = list.head;
        list.head = list.tail;
        list.tail = tempNode;
    }
}
