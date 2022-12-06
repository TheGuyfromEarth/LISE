package bitManipulation;

public class CountNumberOfSetBits {

    public static void main(String[] args) {
        int num = 15; // 1 1 1 1
        int count = 0;

        while(num!=0){
            num = (num & (num-1));
            count++;
        }
        System.out.println(count);
    }
}
