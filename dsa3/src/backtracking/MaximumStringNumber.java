package backtracking;

// Given a number as a String, find the maximum possible number by performing
// atmost k swaps in the given number.

// Example1: num = 3926
// k = 2
// Output => 9623
//
// Example2: num = 62804
// k = 2
// Output => 86204

public class MaximumStringNumber {
    public static void main(String[] args) {
        String num = "62804";
        int k = 2;
        System.out.println(maxNum(num, k,""+Integer.MIN_VALUE));
    }

    public static String maxNum(String num, int k, String maxNumber){

        if(k==0) {
            if(Integer.parseInt(num)>Integer.parseInt(maxNumber)) {
                maxNumber = num;
                return maxNumber;
            }
        }

        for(int i=0;i<num.length()-1;i++){
            for(int j=i+1;j<num.length();j++){
                if(num.charAt(i)<num.charAt(j)) {
                    // swap i and j in the string
                    num = swap(num, i, j);
                    maxNumber = maxNum(num, k-1, maxNumber);
                    num = swap(num,i,j); // backtracking
                }
            }
        }
        return maxNumber;
    }

    private static String swap(String num, int i, int j){
        String start = num.substring(0,i);
        String middle = num.substring(i+1,j);
        String end = num.substring(j+1);

        return start+num.charAt(j)+middle+num.charAt(i)+end;
    }
}
