package dynamicProgramming;

import java.util.Arrays;

// 0 1 1 2 3 5 8 13 21
// 0 1 2 3 4 5 6 7  8
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 8;
//        System.out.println(fib(n));
        int[] dp = new int[n+1];
        System.out.println(fibUsingTabulation(n, dp));
//        Arrays.fill(dp,-1);
//        dp[0] = 0;
//        dp[1] = 1;
//        System.out.println(fibWithDP(n, dp));
    }

    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        System.out.println("Here for n = "+n);
        int num1 = fib(n-1);
        int num2 = fib(n-2);
        return num1+num2;
    }

    public static int fibWithDP(int n,int[] dp){
        if(n == 0 || n == 1){
            return n;
        }
        if(dp[n] != -1)
            return dp[n-1]+dp[n-2];

        System.out.println("Here for n = "+n);
        int num1 = fibWithDP(n-1,dp);//1
        int num2 = fibWithDP(n-2,dp);//1

        dp[n] = num1+num2;

        return num1+num2;
    }

    // finding fibonacci using tabulation
    public static int fibUsingTabulation(int n,int[] dp){
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

}

// fib(5) -> fib(4) + fib(3)

// Steps in Tabulation:
// 1) Create a storage
// 2) Assign meaning to storage
// 3) Identify direction of problem
// 4) Travel and Solve the problem