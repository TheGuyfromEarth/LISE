package bitManipulation;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        x = x^y; // 10^20
        y = x^y; // (10^20)^20 = 10^(20^20) = 10^0 = 10
        x = x^y; // (10^20)^10 = (10^10)^20 = 0^20 = 20

        System.out.println(x);
        System.out.println(y);
    }
}

// (a+b)+c = a+(b+c)