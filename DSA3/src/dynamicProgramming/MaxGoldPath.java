package dynamicProgramming;

// You are a gold digger. And, you start digging from the 1st column in the grid.
// You can start from any cell in the first column.
// Going further, you can dig straight center, left diagonal or right diagonal.
// repeat this process till you reach the last column
// your final objective is to accumulate max possible gold.

public class MaxGoldPath {
    public static void main(String[] args) {
        int[][] arr = {{4, 2, 1, 9},
                      {3, 8, 9, 4},
                      {5, 8, 7, 6},
                      {1, 5, 8, 2}};
        int[][] dp = new int[arr.length][arr[0].length];
        System.out.println(maxGold(arr, dp));
    }

    public static int maxGold(int[][] arr, int[][] dp) {

        for (int col = arr[0].length - 1; col >= 0; col--) {
            for (int row = arr.length - 1; row >= 0; row--) {
                if (col == arr[0].length - 1) {
                    dp[row][col] = arr[row][col];
                } else if (row == arr.length - 1) {
                    dp[row][col] = arr[row][col] + Math.max(dp[row][col + 1], dp[row - 1][col + 1]);
                } else if (row == 0) {
                    dp[row][col] = arr[row][col] + Math.max(dp[row][col + 1], dp[row + 1][col + 1]);
                } else {
                    dp[row][col] = arr[row][col] + Math.max(dp[row + 1][col + 1], Math.max(dp[row][col + 1], dp[row - 1][col + 1]));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            if (dp[row][0] > max)
                max = dp[row][0];
        }
        return max;
    }
}
