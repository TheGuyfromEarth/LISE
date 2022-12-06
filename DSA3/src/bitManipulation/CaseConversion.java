package bitManipulation;

public class CaseConversion {

    public static void main(String[] args) {

        char input = 'F';
//        System.out.println(Integer.toBinaryString('A'));
//        System.out.println(Integer.toBinaryString('B'));
//        System.out.println(Integer.toBinaryString('C'));
//        System.out.println(Integer.toBinaryString('D'));
//        System.out.println(Integer.toBinaryString('E'));
//        System.out.println(Integer.toBinaryString('Y'));
//        System.out.println(Integer.toBinaryString('Z'));
//        System.out.println("******************");
//        System.out.println(Integer.toBinaryString('a'));
//        System.out.println(Integer.toBinaryString('b'));
//        System.out.println(Integer.toBinaryString('c'));
//        System.out.println(Integer.toBinaryString('d'));
//        System.out.println(Integer.toBinaryString('e'));
//        System.out.println(Integer.toBinaryString('y'));
//        System.out.println(Integer.toBinaryString('z'));
        int mask = 1;
//        char res = (char)(input|(mask<<5));
        char res = (char)(input|' ');
//        System.out.println(res);

        char lowerCaseInput = 'g';

//        res = (char)((~(mask<<5))&lowerCaseInput);
        res = (char)(lowerCaseInput&'_');
        System.out.println(res);


    }
}
// B -> 1000010
// 32-> 0100000

// b->  1100010
// B->

