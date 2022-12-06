package dynamicProgramming;

// We will be given two strings, and we need to find the length of longest common substring between the two strings.

// Ex: str1 = blade
//     str2 = trade
// O/P = 3

// Ex: str1 = break
//     str2 = react
// O/P = 3

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String str1 = "break";
        String str2 = "react";
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        System.out.println(lenLongestCommonSubstring(str1, str2, dp));
    }

    public static int lenLongestCommonSubstring(String str1, String str2, int[][] dp) {
        int lenLongestCommonSubstring = 0;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    lenLongestCommonSubstring = Math.max(dp[i][j], lenLongestCommonSubstring);
                }
            }
        }
    return lenLongestCommonSubstring;
    }
}
