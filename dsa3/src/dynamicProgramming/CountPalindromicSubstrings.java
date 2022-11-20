package dynamicProgramming;

// Given a string, find all palindromic substrings and return their count.

// Ex: str = "bacacb";

// b,ba,bac,baca,bacac,bacacb 6
// a,ac,aca,acac,acacb 5
// c,ca,cac,cacb 4
// a,ac,acb 3
// c,cb 2
// b 1

// num of substrings = n(n+1)/2 = 6*7/2 = 21

// O/P = 10

public class CountPalindromicSubstrings {
    public static void main(String[] args) {
        String str = "bacacb";
        boolean[][] dp = new boolean[str.length()][str.length()];
        System.out.println(countPalindromicSubstrings(str, dp));
    }

    public static int countPalindromicSubstrings(String str, boolean[][] dp) {
        int count = 0;
        for (int temp = 0; temp < dp.length; temp++) {
            for (int i = 0, j = temp; j < dp.length; i++, j++) {
                if (temp == 0) {
                    // it is primary diagonal (one char substring)
                    dp[i][j] = true;
                } else if (temp == 1) {
                    // diag just above primary diag (two char substrings)
                    if (str.charAt(i) == str.charAt(j))
                        dp[i][j] = true;
                } else {
                    if (str.charAt(i) == str.charAt(j) && dp[i + 1][j - 1])
                        dp[i][j] = true;
                }
                if(dp[i][j] == true)
                    count++;
            }
        }
        return count;
    }
}