// Write a method called findNote that finds the first opening and the last closing parenthesis in
//a given string and returns the string inside. If not found or if the closing parenthesis precedes
//the opening one, your method should return the original string unchanged.

public class Parenthesis {

    public static void main(String[] args) {

        String input = "The session on OOP begins today(Tuesday) here ";
        String input1 = "The )session on OOP begins today(Tuesday";
        String input2 = "(The session on OOP begins today, Tuesday)";

        String input3 = "The session on () OOP begins today, Tuesday)";
        String input4 = "The ((session on (OOP) begins today, Tuesday))";
        String input5 = "The session on OOP begins today, Tuesday";

        System.out.println(findNote(input5));
    }

    private static String findNote(String input) {

        if (input.contains("(") == false)
            return input;

        if (input.contains(")")) {
            int beg = input.indexOf("(");
            int end = input.lastIndexOf(")");
            if (beg < end)
                return input.substring(beg + 1, end);
        }
        return input;
    }
}
