package patternMatching;

// ideology of KMP, formulation of LPS array - till that position, longest proper prefix that matches with the longest proper suffix

import java.util.Arrays;

// time complexity => O(m+n)
public class KMPAlgorithm {

    public static void main(String[] args) {

        String text = "aabaacaabaab";
        String pattern = "aab";
        String str = pattern + "#" + text;
        int[] lpsArr = new int[str.length()];
        lpsArray(str, lpsArr);
        System.out.println(Arrays.toString(lpsArr));

        // count of pattern
        int count = 0;
        for (int val : lpsArr) {
            if (val == pattern.length())
                count++;
        }
        System.out.println(count);

        // positions where we get the occurrence of pattern in string
        for (int i = 0; i < lpsArr.length; i++) {
            if (lpsArr[i] == pattern.length())
                System.out.print(i - (2 * pattern.length()) + 1 + " ");
        }
    }

    public static void lpsArray(String text, int[] LPS) {

        int i = 1;
        int len = LPS[i - 1];
        while (i < text.length()) {
            // suffix part          prefix part
            if (text.charAt(i) == text.charAt(len)) {
                len++;
                LPS[i] = len;
                i++;
            } else {
                // max value did not satisfy, hence looking for lesser values than max
                if (len > 0) {
                    len = LPS[len - 1];
                } else {
                    LPS[i] = 0;
                    i++;
                }
            }
        }
    }
}
