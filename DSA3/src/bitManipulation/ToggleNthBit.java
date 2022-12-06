package bitManipulation;

public class ToggleNthBit {

    public static void main(String[] args) {
        int num = 10; // 1 0 1 0
        int bitNum = 2;
        int mask = 1;

        int res = (mask<<bitNum)^num;
        System.out.println(res);
    }

}
// 1 0 1 0
// 0 1 0 0
// 1 1 1 0
