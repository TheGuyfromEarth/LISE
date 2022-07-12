// Returns true if p matches, case blind, a substring of s;
// otherwise returns false.

public class StringMatches {

    public static void main(String[] args) {
        System.out.println(hasMatch("ceromputers", "ers"));
    }

    public static boolean hasMatch(String s, String p) {
        if (p.length() > s.length())
            return false;

        s = s.toLowerCase();
        p = p.toLowerCase();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == p.charAt(count)) {
                count++;
            } else {
                count = 0;
            }
            if (count == p.length())
                return true;
        }
        return false;
    }
}
