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
        for (int i = 0; i < k; i++) {
            while (!maxDeque.isEmpty() && arr[i] >= arr[maxDeque.getLast()])
                maxDeque.removeLast();

            while (!minDeque.isEmpty() && arr[i] <= arr[minDeque.getLast()])
                minDeque.removeLast();

            maxDeque.add(i);
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

            while (!maxDeque.isEmpty() && arr[j + k - 1] >= arr[maxDeque.getLast()])
                maxDeque.removeLast();

            while (!minDeque.isEmpty() && arr[j + k - 1] <= arr[minDeque.getLast()])
                minDeque.removeLast();

            maxDeque.add(j + k - 1);
            minDeque.add(j + k - 1);

            // update sum
            sum += arr[minDeque.peek()] + arr[maxDeque.peek()];
        }

        return sum;
    }
}
