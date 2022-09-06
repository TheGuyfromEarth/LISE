
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }
}

public class QueueUsingLinkedList {
    Node front;
    Node rear;

    public QueueUsingLinkedList(){
        front = rear = null;
    }

    public void add(int val){
        Node temp = new Node(val);
        if(front == null)
            front = rear = temp;
        else{
            rear.next = temp;
            rear = temp;
        }
    }

    public int remove() {
        if (front == null)
            throw new RuntimeException("Queue is empty");
        else {
            int val = front.data;
            front = front.next;
            return val;
        }
    }

    public int peek(){
        if (front == null)
            throw new RuntimeException("Queue is empty");
        else {
            return front.data;
        }
    }
}
