public class Factorial {

    public static void main(String[] args) {
        int n = 5;
        int fact = 1;

//        while(n>=1){
//            fact*=n;
//            n--;
//        }
//        System.out.println(fact);

        // recursive
        System.out.println(fact(n));
    }

    private static int fact(int n){
        if(n == 0 || n ==1)
            return 1;

        return fact(n-1)*n;
    }
}
