package bitManipulation;
// Given a number, check if the nth bit is set or unset

public class CheckIFSetOrUnset {
    public static void main(String[] args) {
        int num = 8; // 1000
        int bitNum = 3;

        int mask = 1;
        int res = ((num>>bitNum)&mask);
        if(res == 1)
            System.out.println("The bit is set");
        else
            System.out.println("The bit is unset");

    }
}
