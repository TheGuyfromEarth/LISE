package searchAlgorithms;

// Pre-requisites
// 1) The given input(function) should be monotonic in nature
// 2) The input should be sorted in nature (clarity over point 1)

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {5, 10, 17, 22, 29, 45, 67, 78, 88, 99};
        int searchVal = 45;
        int res = binarySearch(arr, searchVal);
        if (res == -1)
            System.out.println("Element not found");
        else
            System.out.println(searchVal + " found at index: " + res);
    }

    private static int binarySearch(int[] arr, int searchVal) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == searchVal)
                return mid;
            else if (arr[mid] < searchVal) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
