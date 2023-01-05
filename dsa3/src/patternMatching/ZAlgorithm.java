package patternMatching;

// ideology of Z array - from that position, the longest proper prefix (length) which is same as the
// longest substring (length)


import java.util.Arrays;

public class ZAlgorithm {

    public static void main(String[] args) {

        String text = "ababdababc";
        int[] zArray = new int[text.length()];
        zArray(text, zArray);
        System.out.println(Arrays.toString(zArray));
    }

    public static void zArray(String text, int[] Z) {
        int left = 0;
        int right = 0;

        for (int i = 1; i < text.length(); i++) {
            if (i <= right) {
                // try optimization
                Z[i] = Math.min(right - i + 1, Z[i - left]);
            }
            // brute force logic
            while (text.charAt(Z[i]) == text.charAt(i + Z[i])) {
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
