import java.util.Arrays;

public class MergeSort {

    static int[] auxArr;

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 3, 7, 6};
        auxArr = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high) {
        // atleast two elements are present
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                auxArr[k] = arr[i];
                i++;
            }
            else {
                auxArr[k] = arr[j];
                j++;
            }
            k++;
        }

        if (i > mid) {
            while (j <= high) {
                auxArr[k] = arr[j];
                k++;
                j++;
            }
        } else {
            while (i <= mid) {
                auxArr[k] = arr[i];
                k++;
                i++;
            }
        }
        for (int m = low; m <= high; m++)
            arr[m] = auxArr[m];
    }
}
