package dynamicProgramming;

// You have been provided with some weights, where each weight is associated with some cost.
// You have also been given a knapsack of a specific capacity, in which you have to put these
// weights in such a way that the cost is maximum.

// Example:
// weights[] = {2,3,5,6}
// value[] = {8,6,10,7}
// Capacity of sack = 13

// O/P -> 25

public class KnapSack01Problem {

    public static void main(String[] args) {
        int weights[] = {3, 2, 1, 4};
        int values[] = {8, 6, 10, 7};
        int sackCapacity = 8;
        int[][] dp = new int[weights.length + 1][sackCapacity + 1];
        System.out.println(maxCost(weights, values, sackCapacity, dp));
    }

    public static int maxCost(int[] weights, int[] values, int sackCapacity, int[][] dp) {

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0) {
                    dp[i][j] = 0;
                } else if (j == 0) {
                    dp[i][j] = 0;
                } else {
                    if (j >= weights[i - 1]) {
                        int remWt = j - weights[i - 1];
                        if (remWt >= 0) {
                            dp[i][j] = Math.max(values[i - 1] + dp[i - 1][remWt], dp[i - 1][j]);
                        } else
                            dp[i][j] = dp[i - 1][j];
                    } else
                        dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
