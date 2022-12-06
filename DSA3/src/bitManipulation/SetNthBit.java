package bitManipulation;

public class SetNthBit {

    public static void main(String[] args) {
        int num = 6; //110
        int n = 0;
        int mask = 1;

        int res = num|(mask<<n);
        System.out.println(res);
    }
}
