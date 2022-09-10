package arrayDeque;
// I/P -> k = 2
// arr -> -1 10 -4 1 3 -4 -2 -1 9 -2
//O/P -> -1 -4 -4 0 -4 -4 -2 -1 -2

import java.util.ArrayDeque;
import java.util.Arrays;

public class FirstNegativeInKSlidingWindow {
    public static void main(String[] args) {
        int[] arr = {-1, 10, -4, 1, 3, -4, -2, -1, 9, -2};
        int k = 2;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(firstNegInKWindow(arr, k)));
    }

    public static int[] firstNegInKWindow(int[] arr, int k) {
        int[] ans = new int[arr.length - k + 1];
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        // first window of k size add directly to ArrayDeque
        for (int i = 0; i < k; i++) {
            // add only useful(neg) elements
            if (arr[i] < 0)
                arrayDeque.add(i);
        }

        // get first answer for first window
        if (!arrayDeque.isEmpty())
            ans[0] = arr[arrayDeque.peek()];
        else
            ans[0] = 0;

        // repeat same process for remaining windows
        for (int i = 1; i < arr.length - k + 1; i++) {
            // remove elements from arrayDeque which are not part of window
            while(!arrayDeque.isEmpty() && arrayDeque.peek()<i){
                arrayDeque.remove();
            }
            // add the incoming element
            if (arr[i+k-1] < 0)
                arrayDeque.add(i+k-1);
            ans[i] = arrayDeque.isEmpty()?0:arr[arrayDeque.peek()];
        }
        return ans;
    }
}
