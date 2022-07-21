// I/P : a = 4, b = 2
// We need to find a^b. a and b are both positive numbers.
// O/P -> 16

public class PowerOfNumber {

    public static void main(String[] args) {
        int a = 3;
        int b = 8;
//        System.out.println(power(a, b));
        System.out.println(powerFun(a,b));
    }

    private static int power(int a, int b) {
        if (b == 0)
            return 1;

        return power(a, b - 1) * a;
    }

    private static int powerFun(int a, int b) {
        if (b == 0)
            return 1;
        if (b == 1)
            return a;

        int prod = powerFun(a, b / 2);

        int res = prod * prod;

        if(b%2 == 1)
            return res * a;

        return res;
    }
}

// 4^3 = 4*4*4

// 4^3 = 4^2 * 4
// power(4,3) = power(4,2)*4
// power(a,b) = power(a,b-1)*a