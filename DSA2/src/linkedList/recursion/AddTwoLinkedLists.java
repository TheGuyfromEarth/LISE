package linkedList.recursion;

// I/P: Two lists
//     list1 -> 7  9  1  9
//     list2 ->    1  7  1

// O/P -> 8  0  9  0

import linkedList.MyLinkedList;
import linkedList.Node;

public class AddTwoLinkedLists {

    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(7);
        list1.addLast(9);
        list1.addLast(1);
        list1.addLast(9);

        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(1);
        list2.addLast(7);
        list2.addLast(1);

        MyLinkedList revList = addLists(list1,list2);
        list1.traverse();
        list2.traverse();
        revList.traverse();
    }

    public static MyLinkedList addLists(MyLinkedList list1, MyLinkedList list2) {
        MyLinkedList resList = new MyLinkedList();
        int carry = addListsHelper(list1.getHead(), list1.getSize(), list2.getHead(), list2.getSize(), resList);
        if(carry!=0)
            resList.addFirst(carry);
        return resList;
    }

    private static int addListsHelper(Node node1, int placeValue1, Node node2, int placeValue2, MyLinkedList resList) {
        if (node1 == null || node2 == null)
            return 0;
        int res = 0;
        int oldCarry = 0;
        // more items are present in list1 as compared to list2
        if (placeValue1 > placeValue2) {
            oldCarry = addListsHelper(node1.next, placeValue1 - 1, node2, placeValue2, resList);
            res = node1.data + oldCarry;
        }
        // more items are present in list2 as compared to list1
        else if (placeValue1 < placeValue2) {
            oldCarry = addListsHelper(node1, placeValue1, node2.next, placeValue2 - 1, resList);
            res = node2.data + oldCarry;
        }
        // both lists have same place value
        else {
            oldCarry = addListsHelper(node1.next, placeValue1 - 1, node2.next, placeValue2 - 1, resList);
            res = node1.data + node2.data + oldCarry;
        }
        resList.addFirst(res % 10);
        int carry = res / 10;

        return carry;
    }
}


