import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {

        QueueUsingArray queue = new QueueUsingArray(5);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.traverse();
//        queue.add(10);
        queue.remove();
        queue.remove();
        queue.remove();
        queue.traverse();
        System.out.println(queue.peek());
    }
}
