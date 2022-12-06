package dynamicProgramming;

public class CountStairs {
    static int count = 0;

    public static void main(String[] args) {
        int n = 100;
//        countStairs(n);
//        System.out.println(count);
//        System.out.println(countNumStairs(n));

        int[] dp = new int[n + 1];
        dp[0] = 1;
//        System.out.println(countNumStairsMemoized(n, dp));
        System.out.println(countNumStepsTabulation(n, dp));
    }

    public static void countStairs(int n) {
        if (n == 0)
            count++;
        if (n < 0)
            return;

        countStairs(n - 3);
        countStairs(n - 2);
        countStairs(n - 1);
    }

    public static int countNumStairs(int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;

        int x = countNumStairs(n - 3);
        int y = countNumStairs(n - 2);
        int z = countNumStairs(n - 1);

        return x + y + z;
    }

    // dynamic programming
    public static int countNumStairsMemoized(int n, int[] dp) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;

        // use data from memory
        if (dp[n] != 0)
            return dp[n];

        int x = countNumStairsMemoized(n - 3, dp);
        int y = countNumStairsMemoized(n - 2, dp);
        int z = countNumStairsMemoized(n - 1, dp);

        // put data in memory
        dp[n] = x + y + z;

        return dp[n];
    }

    public static int countNumStepsTabulation(int n, int[] dp) {

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[0];
            } else if (i == 2) {
                dp[i] = dp[1]+dp[0];
            } else {
                dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
            }
        }
       return dp[n];
    }
}
