import java.util.Stack;

public class ImplementQueueUsingTwoStacks {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public ImplementQueueUsingTwoStacks(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int data) {
        stack1.push(data);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.peek());
                stack1.pop();
            }
        }
        int val = stack2.peek();
        stack2.pop();
        return val;
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.peek());
                stack1.pop();
            }
        }
        int val = stack2.peek();
        return val;
    }

    public static void main(String[] args) {
        ImplementQueueUsingTwoStacks queue = new ImplementQueueUsingTwoStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(90);
        queue.enqueue(100);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
    }
}
