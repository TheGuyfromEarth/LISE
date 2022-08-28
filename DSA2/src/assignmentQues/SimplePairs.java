package assignmentQues;

import java.util.Arrays;
import java.util.Scanner;

public class SimplePairs {
    public static void main (String[] args) {
        // Your code here
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        long[] arr = new long[N];

        for(int i=0;i<N;i++){
            arr[i] = input.nextInt();
        }

        long sum = 0;

        Arrays.sort(arr);

        for(int i=0;i<N/2;i++){
            long diff = Math.abs(arr[i] - arr[arr.length-1-i]);
            sum+=diff;
        }

        System.out.println(sum);
    }
}
