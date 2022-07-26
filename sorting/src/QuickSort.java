import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {100, 50, 120, 75, 150};
        quickSort(arr, 0, 4);
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
        int pivotIndex = low;
        int i = low, j = high;

        while (i <= j) {

            while (arr[i] <= arr[pivotIndex])
                i++;

            while (arr[j] > arr[pivotIndex])
                j--;

            if (i < j)
                swap(arr, i, j);
        }
        swap(arr, pivotIndex, j);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
