package dynamicProgramming;

public class MinimumCostPath {
    public static void main(String[] args) {
        int[][] arr = {{4, 2, 1, 9},
                      {3, 8, 9, 4},
                      {5, 8, 7, 6},
                      {1, 5, 8, 2}};
        int[][] dp = new int[arr.length][arr[0].length];
        System.out.println(minCostPath(arr, dp));
    }

    public static int minCostPath(int[][] arr, int[][] dp) {

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[0].length - 1; j >= 0; j--) {
                if (i == arr.length - 1 && j == arr[0].length - 1) {
                    dp[i][j] = arr[i][j];
                } else if (i == arr.length - 1) {
                    dp[i][j] = arr[i][j] + dp[i][j + 1];
                } else if (j == arr[0].length - 1) {
                    dp[i][j] = arr[i][j] + dp[i + 1][j];
                } else {
                    dp[i][j] = arr[i][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[0][0];
    }
}
