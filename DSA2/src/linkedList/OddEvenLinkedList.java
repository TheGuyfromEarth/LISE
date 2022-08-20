package linkedList;
// create an odd even linked list having odd elements in the beginning
// and even items after them in same order

// List-> 9 -  4  - 3 - 8 - 9 - 14 - 10 - 5 - 34 - 91

// O/P -> 9 - 3 - 9 - 5 - 91 - 4 - 8 - 14 - 10  - 34

public class OddEvenLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(20);
        list.addLast(4);
        list.addLast(31);
        list.addLast(8);
        list.addLast(90);
        list.addLast(14);
        list.addLast(19);
        list.addLast(56);
        list.addLast(34);
        list.addLast(92);
        MyLinkedList resList = oddEvenList(list);
        resList.traverse();
    }

    private static MyLinkedList oddEvenList(MyLinkedList list){
        MyLinkedList oddList = new MyLinkedList();
        MyLinkedList evenList = new MyLinkedList();

        Node temp = list.head;

        while (temp!=null){
            int val = temp.data;
            list.removeFirst();

            if(val%2==0)
                evenList.addLast(val);
            else
                oddList.addLast(val);

            temp=temp.next;
        }

        // connect odd list's tail with even list's head and update tail

        if(oddList.size == 0 && evenList.size!=0){
            return evenList;
        }else if(oddList.size != 0 && evenList.size == 0)
            return oddList;
        else {
            oddList.tail.next = evenList.head;
            oddList.tail = evenList.tail;
        }
        return oddList;
    }
}
