public class MissingElement {

    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        System.out.println(missingElement(arr));
    }

    public static int missingElement(int[] arr){
        int arrSum = 0;
        for(int i: arr)
            arrSum += i;
        int sum = (arr.length+1)*(arr.length+2)/2;
        return sum-arrSum;
    }
}

// Sum of first N natural nos = n(n+1)/2
// Sum of first 5 nat nos = 5(6)/2 = 15
// Sum of nos in array = 12
// missing no = 15 - 12 = 3

// 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 1 ^ 2 ^ 4 ^ 5 = 3
