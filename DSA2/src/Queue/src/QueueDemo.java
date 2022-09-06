// Demo of queue operations in Java

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> messageQueue = new LinkedList<>();
        messageQueue.add("Hi");
        messageQueue.add("Mate");
        messageQueue.add("Wassup");
        messageQueue.add("Long time!");
        messageQueue.add("Guess you occupied!!");
        messageQueue.add("Catch ya later!");

//        System.out.println(messageQueue);
        System.out.println(messageQueue.remove());
//        System.out.println(messageQueue);
        messageQueue.add("Call me once you're available");
//        System.out.println(messageQueue);
//        System.out.println(messageQueue.peek());

        // offer - same as add(enqueue)
        messageQueue.offer("Trying offer");
        System.out.println(messageQueue);
        // poll - same as remove(dequeue)
        System.out.println(messageQueue.poll());
        System.out.println(messageQueue);
        // element - same as peek
        System.out.println(messageQueue.element());
        System.out.println(messageQueue.isEmpty());
    }
}
