package linkedList;

public class MyLinkedList {
    Node head;
    Node tail;
    int size;

    public void addLast(int data) {

        Node temp = new Node(data);

        // if list is empty
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public void traverse() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void addFirst(int data) {
        Node temp = new Node(data);

        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void removeFirst() {
        if (head == null)
            System.out.println("Error:Linked List is empty");
        else if (size == 1) {
            head = tail = null;
            size--;
        } else {
            head = head.next;
            size--;
        }
    }

    public void removeLast() {
        if (head == null)
            System.out.println("Error:Linked List is empty");
        else if (size == 1) {
            head = tail = null;
            size--;
        } else {
            Node temp = head;
            Node prev = null;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            tail = prev;
            size--;
        }
    }

    public int getFirst() {
        if (head != null)
            return head.data;

        System.out.println("Error:Linked List is empty");
        return -1;
    }

    public int getLast() {
        if (head != null)
            return tail.data;

        System.out.println("Error:Linked List is empty");
        return -1;
    }

    public int get(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Illegal Argument");
        } else if (index == 0)
            return getFirst();
        else if (index == size - 1)
            return getLast();
        else {

            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        return -1;
    }

    public void addAtIndex(int val, int index) {
        if (index < 0 || index > size)
            System.out.println("Illegal argument");
        else if (index == 0)
            addFirst(val);
        else if (index == size)
            addLast(val);
        else {
            Node node = new Node(val);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }

    }

    public void removeAtIndex(int index) {
        if (index < 0 || index >= size)
            System.out.println("Invalid argument");
        else if (index == 0)
            removeFirst();
        else if (index == size - 1)
            removeLast();
        else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node nodeToBeRemoved = temp.next;
            temp.next = nodeToBeRemoved.next;
//            temp.next = temp.next.next;
            size--;
        }
    }
}
