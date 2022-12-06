package heaps;

import java.util.Arrays;

// Min Heap
public class DeletionInHeap {

    public static void main(String[] args) {
        int[] arrHeap = {1, 10, 20, 34, 19, 40};
        int[] arr = deleteRoot(arrHeap);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] deleteRoot(int[] arrHeap) {
        arrHeap[0] = arrHeap[arrHeap.length - 1];
        int[] arr = removeLastElement(arrHeap);
        heapifyBelow(arr, 0);
        return arr;
    }

    private static void heapifyBelow(int[] arr, int index) {
        while (index < arr.length) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int minIndex = index;
            if (leftChildIndex<arr.length && arr[minIndex] > arr[leftChildIndex])
                minIndex = leftChildIndex;
            if (rightChildIndex<arr.length && arr[minIndex] > arr[rightChildIndex])
                minIndex = rightChildIndex;

            if (index != minIndex) {
                // swap
                swap(arr, index, minIndex);
                index = minIndex;
            } else {
                return;
            }
        }

    }

    public static int[] removeLastElement(int[] arr) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    private static void swap(int[] newArr, int i, int j) {
        newArr[i] = newArr[i] ^ newArr[j];
        newArr[j] = newArr[i] ^ newArr[j];
        newArr[i] = newArr[i] ^ newArr[j];
    }

}

