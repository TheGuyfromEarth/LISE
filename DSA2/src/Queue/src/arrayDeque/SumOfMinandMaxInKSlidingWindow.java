package arrayDeque;

import java.util.ArrayDeque;

public class SumOfMinandMaxInKSlidingWindow {

    public static void main(String[] args) {
        int[] arr = {2, 5, -1, 7, -3, -1, -2};
        int k = 4;
        System.out.println(fetchSum(arr, k));
    }

    public static int fetchSum(int[] arr, int k) {

        ArrayDeque<Integer> minDeque = new ArrayDeque<>();
        ArrayDeque<Integer> maxDeque = new ArrayDeque<>();
        int sum = 0;

        // evaluate first window
        int maxIndex = 0;
        int minIndex = 0;

        minDeque.add(0);
        maxDeque.add(0);

        for (int i = 1; i < k; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
                maxDeque.addFirst(i);
            } else
                maxDeque.add(i);
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
                minDeque.addFirst(i);
            } else
                minDeque.add(i);
        }

        sum += arr[minDeque.peek()] + arr[maxDeque.peek()];

        // for remaining windows
        for (int j = 1; j < arr.length - k + 1; j++) {

            // remove elements which are out of the window
            while (!minDeque.isEmpty() && minDeque.peek() < j) {
                minDeque.remove();
            }
            while (!maxDeque.isEmpty() && maxDeque.peek() < j) {
                maxDeque.remove();
            }

            if (!minDeque.isEmpty()) {
                if (arr[minDeque.peek()] > arr[j + k - 1])
                    minDeque.addFirst(j + k - 1);
                else
                    minDeque.add(j + k - 1);
            }
            if (!maxDeque.isEmpty()) {
                if (arr[maxDeque.peek()] < arr[j + k - 1])
                    maxDeque.addFirst(j + k - 1);
                else
                    maxDeque.add(j + k - 1);
            }

            // update sum
            sum += arr[minDeque.peek()] + arr[maxDeque.peek()];
        }

        return sum;
    }
}
