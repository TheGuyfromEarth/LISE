// I/P -> arr = {100,50,30,70,10,80}
// O/P -> 120

import java.util.Arrays;
import java.util.Stack;

public class LargestAreaHistogram {

    public static void main(String[] args) {
        int[] arr = {100, 50, 30, 70, 10, 80};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] arr) {
        int[] nsRt = new int[arr.length];
        int[] nsLt = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        nsRt[arr.length - 1] = arr.length;
        st.push(arr.length - 1);

        for (int i = arr.length - 2; i >= 0; i--) {
            while (!st.isEmpty() && arr[i]<arr[st.peek()])
                st.pop();
            nsRt[i] = st.isEmpty()?arr.length:st.peek();
            st.push(i);
        }

        Stack<Integer> st1 = new Stack<>();
        nsLt[0] = -1;
        st1.push(0);

        for (int i = 1; i < arr.length; i++) {
            while (!st1.isEmpty() && arr[i]<arr[st1.peek()])
                st1.pop();
            nsLt[i] = st1.isEmpty()?-1:st1.peek();
            st1.push(i);
        }

//        System.out.println(Arrays.toString(nsLt));
//        System.out.println(Arrays.toString(nsRt));

        int maxArea = 0;
        for(int j = 0;j<arr.length;j++){
            int area = (nsRt[j]-nsLt[j]-1)*arr[j];
            if(area>maxArea)
                maxArea = area;
        }
        return maxArea;
    }
}
