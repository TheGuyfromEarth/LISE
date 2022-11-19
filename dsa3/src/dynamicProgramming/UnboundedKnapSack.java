package dynamicProgramming;

// You have been provided with some weights, where each weight is associated with some cost.
// You have also been given a knapsack of a specific capacity, in which you have to put these
// weights in such a way that the cost is maximum. There is an infinite supply of the number of weights available.

// Example:
// weights[] = {2,3,5,6}
// value[] = {8,6,10,7}
// Capacity of sack = 5

// O/P -> 48

public class UnboundedKnapSack {
    public static void main(String[] args) {
        int weights[] = {2, 3, 5, 6};
        int values[] = {4, 6, 10, 7};
        int sackCapacity = 9;
        int[] dp = new int[sackCapacity + 1];
        System.out.println(maxCost(weights, values, sackCapacity, dp));
    }

    public static int maxCost(int[] weights, int[] values, int sackCapacity, int[] dp) {

        for (int sackWt = 1; sackWt <= sackCapacity; sackWt++) {
            for (int wtIndex = 0; wtIndex < weights.length; wtIndex++) {
                if (sackWt >= weights[wtIndex]) {
                    int currVal = values[wtIndex] + dp[sackWt - weights[wtIndex]];
                    if (currVal >= dp[sackWt])
                        dp[sackWt] = currVal;
                }
            }
        }
        return dp[sackCapacity];
    }
}
