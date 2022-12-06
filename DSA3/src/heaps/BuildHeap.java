package heaps;

import java.util.Arrays;

public class BuildHeap {
    public static void main(String[] args) {
        int[] arr = {46,16,29,40,99,62};
        buildHeap(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void buildHeap(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }
    }

    // heapifyBelow
    private static void heapify(int[] arr, int index, int n) {
        int minIndex = index;
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;

        if (leftChildIndex < n && arr[leftChildIndex] < arr[minIndex])
            minIndex = leftChildIndex;

        if (rightChildIndex < n && arr[rightChildIndex] < arr[minIndex])
            minIndex = rightChildIndex;

        if (minIndex != index) {
            swap(arr, minIndex, index);
            heapify(arr,minIndex,n);
        } else {
            return;
        }
    }

    private static void swap(int[] newArr, int i, int j) {
        newArr[i] = newArr[i] ^ newArr[j];
        newArr[j] = newArr[i] ^ newArr[j];
        newArr[i] = newArr[i] ^ newArr[j];
    }
}