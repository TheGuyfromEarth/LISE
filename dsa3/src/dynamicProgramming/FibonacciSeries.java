package dynamicProgramming;

import java.util.Arrays;

// 0 1 1 2 3 5 8 13 21
// 0 1 2 3 4 5 6 7  8
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 8;
//        System.out.println(fib(n));
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;
        System.out.println(fibWithDP(n, dp));
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

}

// fib(5) -> fib(4) + fib(3)