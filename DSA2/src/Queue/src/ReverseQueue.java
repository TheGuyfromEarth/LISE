// I/P -> 10 20 5 30 15
// O/P -> 15 30 5 20 10

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(5);
        queue.add(30);
        queue.add(15);
        System.out.println(queue);
        reverse(queue);
        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        // transfer elements from queue to stack
        while(queue.isEmpty() == false){
            stack.push(queue.peek());
            queue.remove();
        }
        // transfer elements from stack to queue
        while (!stack.isEmpty()){
            queue.add(stack.peek());
            stack.pop();
        }
    }
}
