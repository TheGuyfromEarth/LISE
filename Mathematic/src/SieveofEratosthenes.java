import java.util.Arrays;
import java.util.Scanner;

public class SieveofEratosthenes {
    public static void main(String[] args) {

        boolean[] arr = new boolean[100000001];
        Arrays.fill(arr, true);

        arr[0] = false;
        arr[1] = false;

        for (int i = 2; i <= Math.sqrt(arr.length - 1); i++) {
            if (arr[i]) {
                for (int j = i * 2; j < arr.length; j = j + i) {
                    arr[j] = false;
                }
            }
        }
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();

        while (testCases-- > 0) {
            int n = input.nextInt();
            if (arr[n])
                System.out.println("Yes");
            else
                System.out.println("No");
        }

    }
}

