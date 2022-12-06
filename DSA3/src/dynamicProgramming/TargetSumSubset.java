package dynamicProgramming;

// You shall be given an array containing some numbers and a target sum will also be given.
// We need to obtain the sum using array subset, if possible, return true, else return false.

// Ex: arr = {2,3,5} => {2},{3},{5},{2,3},{3,5}{2,5},{2,3,5},{}
// target sum = 9 => true

public class TargetSumSubset {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1};
        int targetSum = 8;
        boolean[][] dp = new boolean[arr.length + 1][targetSum + 1];
        System.out.println(targetSumSubset(arr, targetSum, dp));
    }

    public static boolean targetSumSubset(int[] arr, int targetSum, boolean[][] dp) {

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = false;
                } else {
                    if (dp[i - 1][j])
                        dp[i][j] = true;
                    else {
                        if (j >= arr[i - 1]) {
                            int remVal = j - arr[i - 1];
                            if (dp[i - 1][remVal])
                                dp[i][j] = true;
                            else
                                dp[i][j] = false;
                        } else
                            dp[i][j] = dp[i - 1][j];
                    }
                }
            }
        }
        return dp[dp.length - 1][targetSum];
    }
}
