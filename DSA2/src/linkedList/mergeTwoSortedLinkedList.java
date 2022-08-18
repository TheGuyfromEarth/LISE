package linkedList;

public class mergeTwoSortedLinkedList {

    public static void main(String[] args) {

        MyLinkedList linkedList1 = new MyLinkedList();
        linkedList1.addLast(12);
        linkedList1.addLast(22);
        linkedList1.addLast(30);
        linkedList1.addLast(33);
        linkedList1.addLast(45);
        linkedList1.addLast(80);

        MyLinkedList linkedList2 = new MyLinkedList();
        linkedList2.addLast(10);
        linkedList2.addLast(29);
        linkedList2.addLast(46);
        linkedList2.addLast(69);
        linkedList2.addLast(75);
        linkedList2.addLast(100);

        MyLinkedList resList = merge(linkedList1,linkedList2);
        resList.traverse();
    }

    private static MyLinkedList merge(MyLinkedList list1, MyLinkedList list2){

        Node temp1 = list1.head;
        Node temp2 = list2.head;

        MyLinkedList resList = new MyLinkedList();

        while(temp1!=null && temp2!=null){
            if(temp1.data < temp2.data) {
                resList.addLast(temp1.data);
                temp1 = temp1.next;
            }
            else {
                resList.addLast(temp2.data);
                temp2 = temp2.next;
            }
        }

        // list2 was exhausted and hence we can put elements directly from list1
        while (temp1 != null) {
            resList.addLast(temp1.data);
            temp1 = temp1.next;
        }

        // list1 was exhausted and hence we can put elements directly from list2
        while (temp2 != null) {
            resList.addLast(temp2.data);
            temp2 = temp2.next;
        }

        return resList;

    }
}
