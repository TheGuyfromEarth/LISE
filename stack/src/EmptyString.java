import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class EmptyString {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (stack.isEmpty())
                stack.push(ch);
            else {
                if (stack.peek() == ch)
                    stack.pop();
                else
                    stack.push(ch);
            }
        }
        if (stack.isEmpty())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}