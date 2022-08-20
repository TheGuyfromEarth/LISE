package linkedList;

// Ex: list ->   3 -  4  - 4 - 9 - 9 - 14 - 34 - 34 - 34 - 90
// O/P -> 3 - 4 - 9 - 14 - 34 - 90
public class RemovingDuplicatesFromSortedLinkedList {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(3);
        list.addLast(4);
        list.addLast(4);
        list.addLast(9);
        list.addLast(9);
        list.addLast(14);
        list.addLast(34);
        list.addLast(34);
        list.addLast(34);
        list.addLast(90);
        MyLinkedList newList = removeDuplicates(list);
        newList.traverse();
    }

    private static MyLinkedList removeDuplicates(MyLinkedList list) {
        Node curr = list.head;
        MyLinkedList newList = new MyLinkedList();

        while (curr != null) {
            int val = curr.data;
            curr = curr.next;
            list.removeFirst();

            if(newList.size == 0)
                newList.addLast(val);
            else {
                if (newList.tail.data != val)
                    newList.addLast(val);
            }
        }
        return newList;
    }
}
