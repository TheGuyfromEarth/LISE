public class LinkedListStack {
    Node head;
    int size;

    public LinkedListStack() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int val) {
        Node temp = new Node(val);
        if (isEmpty()) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public int pop() {
        if (head == null) {
            throw new RuntimeException("Stack is empty...Underflow");
        } else {
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
    }

    public int peek() {
        if (head == null) {
            throw new RuntimeException("Stack is empty...Underflow");
        } else {
            return head.data;
        }
    }

    public int getSize() {
        return size;
    }
}
