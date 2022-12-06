package dynamicProgramming;

// 1 1 2 5 14
// 0 1 2 3 4 5 6 7  8

// C0 = 1
// C1 = 1
// C2 = C0*C1 + C1*C0 = 1*1 + 1*1 = 2
// C3 = C0*C2 + C1*C1 + C2*C0 = 1*2 + 1*1 + 2*1 = 5
// C4 = C0*C3 + C1*C2 + C2*C1 + C3*C0 = 5 + 2 + 2 + 5 = 14

public class CatalanNumbers {
    public static void main(String[] args) {
        int n = 4;
        int[] dp = new int[n+1];
        System.out.println(catalanNum(n, dp));
    }

    public static int catalanNum(int num, int[] dp){
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=num; i++){
            int left = 0;
            int right = i-1;
            while(left<=i-1){
                dp[i] += dp[left]*dp[right];
                left++;
                right--;
            }
        }
        return dp[num];
    }
}
