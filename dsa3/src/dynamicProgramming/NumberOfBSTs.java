package dynamicProgramming;

// Given will be number of nodes in a tree, and we need to return
// the total possible BSTs that can be created using those nodes.

// Ex: n = 2 (10,20)
// O/p = 2

// Ex: n = 3 (10,20,30)
// O/P = 5


// n = 0 => 1
// n = 1 -> 1

public class NumberOfBSTs {
    public static void main(String[] args) {
        int num = 4;
        int[] dp = new int[num+1];
        System.out.println(numBSTs(num, dp));
    }

    public static int numBSTs(int num, int[] dp){
        return CatalanNumbers.catalanNum(num,dp);
    }
}
