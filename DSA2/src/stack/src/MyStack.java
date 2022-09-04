
public class MyStack {

    int[] arr;
    int size; // total number of elements in stack
    int top;

    public MyStack(int capacity){
        arr = new int[capacity];
        size = 0;
        top = -1; // top points to the topmost index in our array(stack)
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int val){
        if(top == arr.length-1)
        {
            // Stack(array) is filled up, no space left)
            System.out.println("No space left....Overflow");
        }
        else {
            top++;
            arr[top] = val;
            size++;
        }
    }

    public int pop(){
        if(isEmpty())
        {
            System.out.println("Stack is empty....Underflow");
            throw new RuntimeException();
        }
        else {
            size--;
            return arr[top--];
        }
    }

    public int peek(){
        if(isEmpty())
        {
            System.out.println("Stack is empty....Underflow");
            throw new RuntimeException();
        }else {
            return arr[top];
        }
    }

    public int getSize(){
        return this.size;
    }
}
