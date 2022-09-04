// I/P -> arr = {2,4,6,1,3,10,7,8,4,1,14,3}
// O/P ->      4,6,10,3,10,14,8,14,14,14,-1,-1

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 1, 3, 10, 7, 8, 4, 1, 14, 3};
        System.out.println(Arrays.toString(nextGreaterElement(arr)));
    }

    public static int[] nextGreaterElement(int[] arr) {

        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        // for last element, next greater element does not exist, so always -1
        res[arr.length - 1] = -1;
        stack.push(arr[arr.length - 1]);

        for (int i = arr.length - 2; i >= 0; i--) {
            // check peek and pop if applicable
            while (!stack.isEmpty() && arr[i] >= stack.peek()) {
                stack.pop();
            }
            // write the answer
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            // push in the stack
            stack.push(arr[i]);
        }
        return res;
    }
}
