// I/P : Infix -> 2+5-(9-1)/4
// O/P : Postfix ->
// 1) 2+5 - 91-/4
// 2) 2+5 - 91-4/
// 3) 25+ - 91-4/
// 4) 25+91-4/-

// Postfix Evaluation => 784/- => 72- => 5

// I/P : Infix ->   (a*b) + c/d - f
// O/P : Postfix ->
// 1) ab* + cd/ - f
// 2) ab*cd/+ - f
// 3) ab*cd/+f-

import java.util.Stack;

public class InfixToPostfixConversion {

    public static void main(String[] args) {
        String infixExp = "2+5-(9-1)/4";
        System.out.println(infixToPostfix(infixExp));
    }

    public static String infixToPostfix(String infixExp) {

        Stack<String> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < infixExp.length(); i++) {
            char ch = infixExp.charAt(i);

            if((ch>='a'&& ch<='z') || (ch>='A'&& ch<='Z') || (ch>='0'&& ch<='9'))
                operandStack.push(ch+"");
            else if(ch == '(')
                operatorStack.push(ch);
            else if(ch == ')')
            {
                while(operatorStack.peek()!='('){
                    perform(operandStack,operatorStack);
                }
                operatorStack.pop();
            }
            else{
                while (!operatorStack.isEmpty() && operatorStack.peek()!='(' && precedence(ch)<=precedence(operatorStack.peek())){
                    perform(operandStack,operatorStack);
                }
                operatorStack.push(ch);
            }
        }
        while (!operatorStack.isEmpty())
            perform(operandStack,operatorStack);
        return operandStack.peek();
    }

    private static void perform(Stack<String> operandStack, Stack<Character> operatorStack){
        char opr = operatorStack.pop();
        String val2 = operandStack.pop();
        String val1 = operandStack.pop();
        String res = val1+val2+opr;
        operandStack.push(res);
    }

    private static int precedence(char opr){
        int res = 0;
        switch (opr){
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
