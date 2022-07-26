import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {12, 3, 23, 8, 88, 11};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            swap(arr, minIndex, i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
