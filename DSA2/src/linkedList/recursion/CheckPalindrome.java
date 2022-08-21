package linkedList.recursion;

// list -> 1 3 3 1
// O/P -> true

import linkedList.MyLinkedList;
import linkedList.Node;

public class CheckPalindrome {

    static Node temp;
    static int listSize;

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(4);
        list.addLast(7);
        list.addLast(7);
        list.addLast(4);
        list.addLast(1);
        System.out.println(isPalindrome(list));
    }

    public static boolean isPalindrome(MyLinkedList list) {
        temp = list.getHead();
        listSize = list.getSize();
        return isPalHelper(list.getHead(), 0);
    }

    private static boolean isPalHelper(Node node, int count) {
        if (node == null)
            return true;

        boolean res = isPalHelper(node.next, count + 1);
        if (!res)
            return false;

        if (count >= listSize / 2) {
            if (temp.data != node.data)
                return false;

            temp = temp.next;
        }

        return true;
    }
}
