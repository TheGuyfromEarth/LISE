import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {23, 56, 11, 8, 3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        // outer loop -> keeps track of the passes
        for (int i = 0; i < n - 1; i++) {
            boolean isSwapped = false;
            // inner loop -> performs adjacent comparisons (in each iteration, runs one lesser time)
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSwapped = true;
                    swap(arr, j, j + 1);
                }
            }
            if (isSwapped == false)
                break;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
