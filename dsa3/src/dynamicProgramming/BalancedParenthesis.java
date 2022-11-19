package dynamicProgramming;

// Given number of parenthesis, return the total possible ways to arrange these parenthesis
// in a balanced manner.

// Ex: num = 1 => ()
// O/P = 1

// Ex: num = 2 -> ()() => ()(),(())
// O/P = 2

// Ex: num = 3 -> ()()() => ( )      ( )( )       ( )
//                          2*0       1*1         0*2
//                  (()()), ((()))   (())(())    ()()(),()(())
// O/P = 5

public class BalancedParenthesis {
    public static void main(String[] args) {
        int num = 4;
        int[] dp = new int[num+1];
        System.out.println(numBalancedParenthesis(num, dp));
    }

    public static int numBalancedParenthesis(int num, int[] dp){
        return CatalanNumbers.catalanNum(num,dp);
    }
}
