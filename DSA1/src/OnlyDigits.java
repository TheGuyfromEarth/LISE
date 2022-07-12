// Write a method that tests whether a given string contains only digits.

public class OnlyDigits {

    public static void main(String[] args) {
        String input = "987479a74";
        System.out.println(onlyDigits(input));
    }

    private static boolean onlyDigits(String input) {

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch) == false)
                return false;
        }
        return true;
    }
}

// 1) Check whether the given two strings are anagrams or not.
// I/P -> str1 = "name", " str2 = "mane"

