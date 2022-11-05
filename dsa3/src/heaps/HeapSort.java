package heaps;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {40, 10, 20, 34, 19, 1};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr) {
        // 1) Build the heap
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapifyBelow(arr, i, n - 1);
        }
        System.out.println(Arrays.toString(arr));
        // 2) sort the heap
        for (int i = arr.length - 1; i > 0; i--) {
            // swap the zeroth index element and last unsorted element
            swap(arr, i, 0);
            if (i > 1)
                heapifyBelow(arr, 0, i - 1);
        }
    }

    private static void heapifyBelow(int[] arr, int index, int upperBound) {
        while (index <= upperBound) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int maxIndex = index;
            if (leftChildIndex <= upperBound && arr[maxIndex] < arr[leftChildIndex])
                maxIndex = leftChildIndex;
            if (rightChildIndex <= upperBound && arr[maxIndex] < arr[rightChildIndex])
                maxIndex = rightChildIndex;

            if (index != maxIndex) {
                // swap
                swap(arr, index, maxIndex);
                index = maxIndex;
            } else {
                return;
            }
        }
    }

    private static void swap(int[] newArr, int i, int j) {
        newArr[i] = newArr[i] ^ newArr[j];
        newArr[j] = newArr[i] ^ newArr[j];
        newArr[i] = newArr[i] ^ newArr[j];
    }
}
