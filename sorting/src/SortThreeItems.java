// Consider three items represented by three numbers, 0, 1 and 2. We need to
// sort the array where all 0s come first, then 1s and then the 2s.
// Ex - arr = {0,1,0,0,1,2,2,2,1,1,0}
// O/P = {0,0,0,0,1,1,1,1,2,2,2}

import java.util.Arrays;

public class SortThreeItems {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 1, 2, 2, 2, 1, 1, 0};
//        sortItems(arr);
        onePass(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortItems(int[] arr) {
        int numZeroes = 0;
        int numOnes = 0;
        int numTwos = 0;

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0:
                    numZeroes++;
                    break;
                case 1:
                    numOnes++;
                    break;
                case 2:
                    numTwos++;
                    break;
            }
        }
        int i = 0;

        for (i = 0; i < numZeroes; i++)
            arr[i] = 0;

        int j = 0;
        for (j = i; j < numOnes + i; j++) {
            arr[j] = 1;
        }

        for (int k = j; k < numTwos + j; k++) {
            arr[k] = 2;
        }

    }

    // 1) All elements before low will be 0;
    // 2) All elements after high will be 2;

    // 3) Run a loop until mid<=high; mid moves one step at a time
    // 3a) mid == 0 -> swap(low++,mid++)
    // 3b) mid == 1 -> continue
    // 3c) mid == 2 -> swap(mid,high--)

    private static void onePass(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
