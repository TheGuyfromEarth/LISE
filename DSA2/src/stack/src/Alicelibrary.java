import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner input = new Scanner(System.in);
        String str = input.next();

        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!='\\'){
                stack.push(ch);
            }
            else{
                StringBuilder sb = new StringBuilder("");
                while(!stack.isEmpty() && stack.peek()!='/'){
                    sb.append(stack.peek());
                    stack.pop();
                }
                stack.pop();
                if(stack.isEmpty()){
                    System.out.println(sb);
                    break;
                }else{
                    for(int j=0;j<sb.length();j++)
                        stack.push(sb.charAt(j));
                }
            }
        }

    }
}