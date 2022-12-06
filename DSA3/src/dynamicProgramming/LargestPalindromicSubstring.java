package dynamicProgramming;

// return the length of the largest palindromic substring
public class LargestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "baccab";
        boolean[][] dp = new boolean[str.length()][str.length()];
        System.out.println(lenLargestSubstring(str, dp));
    }

    public static int lenLargestSubstring(String str, boolean[][] dp) {
        int maxLengthSubstring = 0;
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
                if (dp[i][j] == true) {
                    if (temp + 1 > maxLengthSubstring)
                        maxLengthSubstring = temp + 1;
                }
            }
        }
        return maxLengthSubstring;
    }
}
