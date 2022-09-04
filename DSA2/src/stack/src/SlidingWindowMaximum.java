// k = 4
// I/P -> arr = {2,4,6,1,3,10,7,8,4,1,14,3}
// O/P =       {6,6,10,10,10,10,8,14,14}

import java.util.Arrays;
import java.util.Stack;

public class SlidingWindowMaximum {

    public static void main(String[] args) {
        int k = 4;
        int[] arr = {2, 4, 6, 1, 3, 10, 7, 8, 4, 1, 14, 3};
        int[] nextGrArr = nextGreaterElement(arr);
        System.out.println(Arrays.toString(maxArray(arr, nextGrArr, k)));
    }

    public static int[] maxArray(int[] arr, int[] nextGrArr, int k){
        int[] maxArr = new int[arr.length-k+1];
        int i = 0;
        int j = 0;

        for(;i<=arr.length-k;i++){
            j = i;
            while(nextGrArr[j]<i+k){
                j = nextGrArr[j];
            }
            maxArr[i] = arr[j];
        }
        return maxArr;
    }

    public static int[] nextGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] nextGrArr = new int[arr.length];

        nextGrArr[arr.length - 1] = arr.length;
        stack.push(arr.length - 1);

        for (int i = arr.length - 2; i >= 0; i--) {
            int curVal = arr[i];
            while(!stack.isEmpty() && curVal>=arr[stack.peek()]){
                stack.pop();
            }
            nextGrArr[i] = stack.isEmpty()?arr.length:stack.peek();
            stack.push(i);
        }
        return nextGrArr;
    }


}
