// M = 10^9+7

public class ModuloN {

    public static void main(String[] args) {

        int num = 10;
        int M = 1000000007;
        System.out.println(factorial(num, M));
    }

    public static long factorial(int num, int M) {
        long fact = 1;

        while (num != 1) {
            fact = (fact%M * num%M)%M;
            num--;
        }
        return fact;
    }
}

// 4%7 = 4
// 14%7 = 0
// 9%7 = 2
// 1000%7 = 6

// Mod Properties

// a) (A+B)%M = (A%M + B%M)%M
// b) (A*B)%M = (A%M * B%M)%M

// div = (Div*Quot)+Rem

