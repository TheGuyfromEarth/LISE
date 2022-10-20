import java.util.HashMap;
import java.util.Map;

public class SubArrayForGivenSum {

    public static void main(String[] args) {
        int[] arr = {10, 10, 5, -10, -5, 5, 10};
        int sum = 15;
        findSubArray(arr, sum);
    }

    public static void findSubArray(int[] arr, int sum) {
        int currSum = 0;
        int startIndex = 0;
        int endIndex = -1;

        Map<Integer, Integer> sumMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum == sum) {
                endIndex = i;
                break;
            }

            if (sumMap.containsKey(currSum - sum)) {
                startIndex = sumMap.get(currSum - sum) + 1;
                endIndex = i;
                break;
            }
            sumMap.put(currSum, i);
        }

        if (endIndex == -1)
            System.out.println("Sub array doesn't exist");
        else
            System.out.println("Start value " + startIndex + " and end value " + endIndex);
    }
}
