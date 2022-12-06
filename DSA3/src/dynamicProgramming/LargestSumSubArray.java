package dynamicProgramming;

// Given an array, we need to return the sum of the largest sum sub array

// Ex: arr = {1,2, 8,-3,-1,10,-20,3,2,9,1};
// sum = 17

public class LargestSumSubArray {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 8, -3, -1, 10, -20, 3, 2, 9, 1};
        int[] arr = {10, -12, 5, 8, -3, 9, 1, 5, -7, -2, 4, 2};
        System.out.println(maxSumSubArray(arr));
    }

    // kadane's algorithm
    public static int maxSumSubArray(int[] arr) {
        int currSum = arr[0];
        int overallSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (currSum < 0) {
                currSum = arr[i];
            } else {
                currSum += arr[i];
            }
            if (currSum >= overallSum)
                overallSum = currSum;
        }
        return overallSum;
    }
}
