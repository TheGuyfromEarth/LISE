package src.Queue.src;

import java.util.LinkedList;
import java.util.Queue;

public class Revision {

    public static void main(String[] args) {

        Queue q =  new LinkedList();
        q.add(100);
        q.add(70);
        q.remove();
        q.offer(200);
        q.poll();
        System.out.println(q.peek());
        System.out.println(q.element());
        System.out.println(q);
    }
}
