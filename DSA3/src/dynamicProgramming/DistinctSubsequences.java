package dynamicProgramming;

// Given a string, return the count of all the possible distinct subsequences present in that string.
// Ex: str = "abc"
// O/P -> 8 ("",a,b,ab,c,ac,bc,abc)

// General Formula for number of subsequences = 2^n

// Ex: str = "aba"
// O/P ->  7 ("",a,b,ab,aa,ba,aba)

import java.util.HashMap;

public class DistinctSubsequences {
    public static void main(String[] args) {
        String str = "abab";
        int[] dp = new int[str.length() + 1];
        System.out.println(distinctSubsequences(str, dp));
    }

    public static int distinctSubsequences(String str, int[] dp) {
        dp[0] = 1;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i - 1] * 2;
            if (map.containsKey(str.charAt(i-1))) {
                int prevIndex = map.get(str.charAt(i-1));
                dp[i] = dp[i] - dp[prevIndex - 1];
            }
            map.put(str.charAt(i-1), i);
        }
        return dp[dp.length-1];
    }
}

// longestRepeatedSubsequence
// Ex: str = "adbagadba" // O/P = 4