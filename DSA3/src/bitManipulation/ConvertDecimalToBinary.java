package bitManipulation;

public class ConvertDecimalToBinary {

    public static void main(String[] args) {
        int decNum = 12; // 1100
//        for (int i = 3; i >= 0; i--) {
//            System.out.print((decNum >> i) & 1);
//        }
        System.out.println(Integer.toBinaryString(decNum));
    }
}

