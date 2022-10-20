
public class TwoMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6};
        twoMissingNumbers(arr);
    }

    public static void twoMissingNumbers(int[] arr){
        int arrSum = 0;
        for(int i: arr)
            arrSum += i;
        int sum = (arr.length+2)*(arr.length+3)/2;
        int sumTwoNos = sum-arrSum;
        int temp = sumTwoNos/2;
        int sumMoreThanTemp = 0;
        for(int i: arr){
            if(i>temp)
                sumMoreThanTemp+=i;
        }
        int actualSumMoreThanTemp = 0;
        for(int i=temp+1;i<=arr.length+2;i++){
            actualSumMoreThanTemp+=i;
        }
        int firstMissingNum = actualSumMoreThanTemp - sumMoreThanTemp;
        int secondMissingNum = sumTwoNos - firstMissingNum;
        System.out.println(firstMissingNum+" , "+secondMissingNum);
    }
}

// x + y = 5

// 3-N(5)
// sum = 12
// arrSum = 9
// misnum = 3

// 1 - N/2 (2)
// sum = 3
// arrSum = 1
// misNum = 2