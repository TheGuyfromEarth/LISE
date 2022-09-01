// I/P: (a+b)*((c+d))
// O/P: true

import java.util.Stack;

public class DuplicateBrackets {

    public static void main(String[] args) {
        String input = "(a+b)*(c-(b-d))";
        System.out.println(hasDuplicateBrackets(input));
    }

    public static boolean hasDuplicateBrackets(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) { //O(n)
            char ch = input.charAt(i);
            if (ch == ')') {
                char topChar = stack.peek();
                if (topChar == '(')
                    return true;
                else {
                    while (!stack.isEmpty() && stack.peek() != '(') { // O(n) cumulatively
                        stack.pop();
                    }
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }

        return false;

    }
}
