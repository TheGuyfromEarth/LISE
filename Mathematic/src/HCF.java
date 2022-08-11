// HCF/GCD of two numbers:

// Ex: 14 and 36
// O/P: 2

// Ex: 8, 12, 20
// O/P: 4

public class HCF {

    public static int hcf(int a,int b){
        if(b == 0)
            return a;

        return hcf(b,a%b);
    }
}
