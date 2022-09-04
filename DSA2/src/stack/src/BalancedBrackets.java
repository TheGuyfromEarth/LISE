// I/P : (a+b)) + (c-d)
// O/P : false

// I/P : (a+b) + ((c-d)
// O/P : false

// I/P : [(a+b) + (c-d])
// O/P : false

// I/P : {[a+b] + (c-d)}
// O/P : true

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String input = "{[a+b] + (c-d)}";
        System.out.println(hasBalancedBrackets(input));
    }

    public static boolean hasBalancedBrackets(String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{')
                stack.push(ch);
            else if (ch == ')') {
                if (!evaluateBracket(stack, '('))
                    return false;
            } else if (ch == ']') {
                if (!evaluateBracket(stack, '['))
                    return false;
            } else if (ch == '}') {
                if (!evaluateBracket(stack, '{'))
                return false;
            }
        }

        // there were extra opening brackets
        if (!stack.isEmpty())
            return false;

        return true;
    }

    private static boolean evaluateBracket(Stack<Character> stack, char bracketType) {
        if (stack.isEmpty())
            return false;

        char topStack = stack.peek();
        if (topStack == bracketType)
            stack.pop();
        else
            return false;

        return true;
    }
}
