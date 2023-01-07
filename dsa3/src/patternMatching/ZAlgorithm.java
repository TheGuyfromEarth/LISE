package patternMatching;

// ideology of Z array - from that position, the longest proper prefix (length) which is same as the
// longest substring (length)

import java.util.Arrays;

// time complexity => O(m+n)
public class ZAlgorithm {

    public static void main(String[] args) {

        String text = "ababdababc"; // n characters
        String pattern = "ab"; // m characters
        String str = pattern + "$" + text;
        int[] zArray = new int[str.length()];
        zArray(str, zArray);
        System.out.println(Arrays.toString(zArray));

        // count of pattern
        int count = 0;
        for (int val : zArray) {
            if (val == pattern.length())
                count++;
        }
        System.out.println(count);

        // positions where we get the occurrence of pattern in string
        for (int i = 0; i < zArray.length; i++) {
            if (zArray[i] == pattern.length())
                System.out.print(i - (pattern.length() + 1) + 1 + " ");
        }
    }

    public static void zArray(String text, int[] Z) {
        int left = 0;
        int right = 0;

        for (int i = 1; i < text.length(); i++) { // O(n)
            if (i <= right) {
                // try optimization
                Z[i] = Math.min(right - i + 1, Z[i - left]);
            }
            // brute force logic
            //  proper prefix                    substring
            while (i + Z[i] < text.length() && text.charAt(Z[i]) == text.charAt(i + Z[i])) { //O(n+m)
                Z[i]++;
            }
            // reset the range
            if (i + Z[i] - 1 > right) {
                left = i;
                right = i + Z[i] - 1;
            }
        }

    }
}
