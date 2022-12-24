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
        int[][] dpTabulation = new int[str1.length()+1][str2.length()+1];
//        for (int i = 0; i < dp.length; i++) {
//            for (int j = 0; j < dp[0].length; j++) {
//                dp[i][j] = -1;
//            }
//        }
//        System.out.println(lenLongestCommonSubsequence(str1, str2, str1.length() - 1, str2.length() - 1,dp));
        System.out.println(lenLongestCommonSubsequenceUsingTabulation(str1, str2, dpTabulation));

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


    public static int lenLongestCommonSubsequenceUsingTabulation(String str1, String str2, int[][] dp) {
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
