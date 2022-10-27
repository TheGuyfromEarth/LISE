package bitManipulation;

public class UnsetNthBit {
    public static void main(String[] args) {
        int num = 15; // 1111
        int bitNum = 2;

        int mask = 1;
        int res = ((~(mask<<bitNum))&num);
        System.out.println(res);
    }
}

// 1 1 1 1
// 1 0 1 1