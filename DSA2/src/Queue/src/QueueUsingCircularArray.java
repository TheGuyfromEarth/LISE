public class QueueUsingCircularArray {
    int[] arr;
    int front;
    int rear;

    public QueueUsingCircularArray(int capacity) {
        arr = new int[capacity];
        front = rear = -1;
    }

    public void add(int val) {
        if ((rear + 1) % arr.length == front)
            System.out.println("Queue is full");
        else if (front == -1) {
            arr[++rear] = val;
            front++;
        } else {
            rear = (rear + 1) % arr.length;
            arr[rear] = val;
        }
    }

    public int remove() {
        if (front == -1)
            throw new RuntimeException("Queue is empty");
        else if (front == rear) {
            int val = arr[front];
            front = rear = -1;
            return val;
        } else {
            int val = arr[front];
            front = (front + 1) % arr.length;
            return val;
        }
    }

    public int peek() {
        if (front == -1)
            throw new RuntimeException("Queue is empty");
        return arr[front];
    }

    public void traverse() {
        if (front == -1)
            System.out.println("Queue is empty");
        else if (rear > front) {
            for (int i = front; i <= rear; i++)
                System.out.print(arr[i] + " ");
        } else if (front == rear)
            System.out.println(arr[front]);
        else {
            for (int i = front; i < arr.length; i++)
                System.out.print(arr[i] + " ");
            for (int i = 0; i <= rear; i++)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
