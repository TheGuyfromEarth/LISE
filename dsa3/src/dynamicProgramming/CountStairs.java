package dynamicProgramming;

public class CountStairs {
    static int count = 0;
    public static void main(String[] args) {
        int n = 3;
        countStairs(n);
        System.out.println(count);
    }

    public static void countStairs(int n){
        if(n == 0)
           count++;
        if(n<0)
            return;

        countStairs(n-3);
        countStairs(n-2);
        countStairs(n-1);
    }
}
