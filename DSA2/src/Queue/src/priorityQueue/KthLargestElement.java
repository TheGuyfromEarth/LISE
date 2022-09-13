// Input: array -> 10,4,68,38,92,11,8
// k = 3
// O/P: 38

package priorityQueue;

import java.util.PriorityQueue;

public class KthLargestElement {

    public static void main(String[] args) {

        int[] arr = {10, 4, 68, 38, 92, 11, 8};
        int k = 3;
        System.out.println(kthLargestElement(arr, k));
    }

    public static int kthLargestElement(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            // first k elements should be simply enqueued
            if(i<k)
                pq.add(arr[i]);
            else{
                if(arr[i]>=pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        return pq.peek();
    }
}
