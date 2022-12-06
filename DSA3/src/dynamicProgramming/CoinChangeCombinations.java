package dynamicProgramming;

public class CoinChangeCombinations {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5};
        int targetSum = 10;
        int[] dp = new int[targetSum + 1];
        System.out.println(coinChangeCombination(arr, targetSum, dp));
    }

    public static int coinChangeCombination(int[] arr, int targetSum, int[] dp) {
        dp[0] = 1;
        for (int coin : arr) {
            for (int sum = 1; sum <= targetSum; sum++) {
                if(sum >= coin){
                    dp[sum] = dp[sum] + dp[sum-coin];
                }
            }
        }
        return dp[targetSum];
    }
}
