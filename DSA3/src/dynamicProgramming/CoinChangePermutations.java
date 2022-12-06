package dynamicProgramming;

// you have an infinite supply of coins of certain denomination given in an arr .
// How many ways can you generate a certain target sum (Permutations)?

// Ex: arr -> {2,3,5}
// tegertSum = 10

// no of ways = 14

public class CoinChangePermutations {
    public static void main(String[] args) {
        int[] arr = {2,3,5};
        int targetSum = 10;
        int[] dp = new int[targetSum+1];
        System.out.println(coinChangeNumWays(arr, targetSum, dp));
    }

    public static int coinChangeNumWays(int[] arr, int targetSum, int[] dp){
        dp[0] = 1;
        for(int sum = 1; sum<=targetSum; sum++){
            int add = 0;
            for(int coin: arr){
                if(sum-coin>=0)
                    add += dp[sum-coin];
            }
            dp[sum] = add;
        }
        return dp[targetSum];
    }
}