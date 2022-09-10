// I/P: 1, 2 , 3, 4
// k = 2
// O/P: 2, 1, 3, 4

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElements {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(6);
        queue.add(35);
        queue.add(88);
        queue.add(3);
        queue.add(12);
        int k = 3;
        System.out.println(queue);
        reverseKElements(queue, k);
        System.out.println(queue);
    }

    public static void reverseKElements(Queue<Integer> queue, int k) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.peek());
            queue.remove();
        }
        for (int i = 0; i < k; i++) {
            queue.add(stack.peek());
            stack.pop();
        }
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.peek());
            queue.remove();
        }
    }
}
