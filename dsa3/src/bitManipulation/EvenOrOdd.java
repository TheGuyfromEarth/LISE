package bitManipulation;

public class EvenOrOdd {

    public static void main(String[] args) {
        int num = 1201;
        int mask = 1;

        int res = num&mask;
        if(res == 0)
            System.out.println(num +" is even");
        else
            System.out.println(num +" is odd");

    }

    public static String findEvenOdd(int num){
        return ((num&1)==1)?"Odd":"Even";
    }
}
