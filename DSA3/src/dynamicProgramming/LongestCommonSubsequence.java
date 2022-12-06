package dynamicProgramming;

// Given two strings, return the length of longest common subsequence

// Ex: str1 = hungry
//     str2 = hungary
// O/P = 6

public class LongestCommonSubsequence {

    static int count = 0;

    public static void main(String[] args) {
        String str1 = "hungry";
        String str2 = "hungary";
        int[][] dp = new int[str1.length()][str2.length()];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(lenLongestCommonSubsequence(str1, str2, str1.length() - 1, str2.length() - 1,dp));
    }

    public static int lenLongestCommonSubsequence(String str1, String str2, int index1, int index2, int[][] dp) {
        if (str1.isEmpty() || str2.isEmpty())
            return 0;
        if (dp[index1][index2] != -1)
            return dp[index1][index2];
//        System.out.println("index1: "+index1 +" index2: "+index2);
        if (str1.charAt(index1) == str2.charAt(index2)) {
            return dp[index1][index2] = 1 + lenLongestCommonSubsequence(str1.substring(0, index1), str2.substring(0, index2), index1 - 1, index2 - 1,dp);
        } else {
            return dp[index1][index2] = Math.max(lenLongestCommonSubsequence(str1.substring(0, index1), str2, index1 - 1, index2,dp), lenLongestCommonSubsequence(str1, str2.substring(0, index2), index1, index2 - 1,dp));
        }
    }
}
