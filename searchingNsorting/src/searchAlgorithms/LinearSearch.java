package searchAlgorithms;

// arr = {12,45,66,21,78,44}
// searchElement = 12
// index = 0

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {12, 45, 66, 21, 78, 44};
        int searchElement = 66;
        int res = linearSearch(arr, searchElement);
        if (res == -1)
            System.out.println("Element not found");
        else
            System.out.println(searchElement + " found at index: " + res);
    }

    private static int linearSearch(int[] arr, int searchElement) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement)
                return i;
        }
        return -1;
    }
}


// 1) Worst Case TC (Big O Notation) - O(N) - O(6)
// 2) Best Case TC (Big Omega Notation) - O(1)
// 3) Average Case TC (Big Theta Notation) - O((N+1)/2) O(3)