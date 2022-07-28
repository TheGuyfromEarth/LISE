import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {100, 50, 120, 75, 150};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        // Atleast two elements are present
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // 1
        int pivotIndex = low;
        // 2
        int i = low, j = high;

        while (i <= j) {

            // 2a
            while (arr[i] <= arr[pivotIndex])
                i++;

            // 2b
            while (arr[j] > arr[pivotIndex])
                j--;

            // 2c
            if (i < j)
                swap(arr, i, j);
        }

        // only swap if indices to be swapped are not same
        if (j != pivotIndex)
            // 3
            swap(arr, pivotIndex, j);
        // 4
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// Steps in partition:
// 1) Select a pivot index
// 2) take 2 pointers, i and j. i begins from low and j begins from high and keep pushing
// i towards right and j towards left until i<=j.
// 2a) Keep moving i towards right until arr[i]<=arr[pivot].
// 2b) Keep moving j towards left until arr[j]>arr[pivot].
// 2c) When 2a and 2b are done, swap i and j (values). (only if i less than j)
// 3) When i becomes greater than j, swap j and pivot (values).
// 4) return the partition index.