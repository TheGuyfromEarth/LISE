
public class QueueUsingArray {

    int[] arr;
    int front;
    int rear;

    public QueueUsingArray(int capacity) {
        arr = new int[capacity];
        front = rear = -1;
    }

    public void add(int element) {
        if (front == -1) {
            front++;
            rear++;
            arr[front] = element;
        } else if (rear == arr.length - 1)
            System.out.println("Queue is full");
        else {
            arr[++rear] = element;
        }
    }

    public int remove() {
        if (front == -1) {
            throw new RuntimeException("Queue is empty");
        } else {
            int val = arr[0];

            for (int i = 1; i <= rear; i++) {
                arr[i-1] =arr[i];
            }
            rear--;
            return val;
        }
    }

    public int peek(){
        if (front == -1) {
            throw new RuntimeException("Queue is empty");
        }
        return arr[0];
    }


    public void traverse(){
        for(int i = front; i<=rear;i++)
            System.out.print(arr[i]+" ");

        System.out.println();
    }
}
