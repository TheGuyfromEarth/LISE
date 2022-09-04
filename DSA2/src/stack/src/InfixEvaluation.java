// I/P: 2+5 - (9-1)/4
// O/P: 5

import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) {
        String expression = "2+5-(9-1)/4";
        System.out.println(evaluate(expression));
    }

    public static int evaluate(String expression) {
        Stack<Character> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch)) {
                operandStack.push(ch);
            } else if (ch == '(') {
                operatorStack.push(ch);
            } else if (ch == ')') {
                while (operatorStack.peek() != '(') {
                    char opr = operatorStack.pop();
                    int val2 = operandStack.pop()-'0';
                    int val1 = operandStack.pop()-'0';
                    char res = Integer.toString(findResult(val1,val2,opr)).charAt(0);
                    operandStack.push(res);
                }
                // removing '(' from the operator stack
                operatorStack.pop();
            } else {
                if(operatorStack.isEmpty() || operatorStack.peek() == '(')
                    operatorStack.push(ch);
                else {
                    while (!operatorStack.isEmpty() && operatorStack.peek() != '(' && precedence(ch) <= precedence(operatorStack.peek())) {
                        char opr = operatorStack.pop();
                        int val2 = operandStack.pop() - '0';
                        int val1 = operandStack.pop() - '0';
                        char res = Integer.toString(findResult(val1,val2,opr)).charAt(0);
                        operandStack.push(res);
                    }
                    operatorStack.push(ch);
                }
            }
        } // end of for loop

        // to evaluate remaining items in operator stack, if any
        while (!operatorStack.isEmpty()) {
            char opr = operatorStack.pop();
            int val2 = operandStack.pop()-'0';
            int val1 = operandStack.pop()-'0';
            char res = Integer.toString(findResult(val1,val2,opr)).charAt(0);
            operandStack.push(res);
        }
        return operandStack.peek() - '0';
    }

    private static int findResult(int val1, int val2, char opr) {
        int res = 0;
        switch (opr) {

            case '+':
                res = val1 + val2;
                break;
            case '-':
                res = val1 - val2;
                break;
            case '*':
                res = val1 * val2;
                break;
            case '/':
                res = val1 / val2;
                break;
        }
        return res;
    }

    private static int precedence(char opr){
        int res = 0;
        switch (opr) {

            case '+':
                res = 1;
                break;
            case '-':
                res = 1;
                break;
            case '*':
                res = 2;
                break;
            case '/':
                res = 2;
                break;
        }
        return res;
    }
}

// Rules:

// 1) If operand, push in opnd stack
// 2) If ( comes, simply push in opr stack.
// 3) If ) comes, start popping opr stack until you find the opening (
// 4) If operator comes,compare the precedence with the peek of the opr stack.
// 4a) If the precedence is equal or lesser, pop from opr stack and then push the incoming opr.
// (Stop popping if the stack becomes empty, you encounter an opening bracket and you encounter
// an opr of lesser precedence)
// 4b) If the precedence is greater, simply push the incoming opr in stack.