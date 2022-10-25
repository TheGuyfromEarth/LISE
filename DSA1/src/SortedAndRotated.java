// I/P -> 3 4 2 1
// I/P -> 1 3 2

import java.util.Scanner;

public class SortedAndRotated {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int numTestCases = inp.nextInt();
        while(numTestCases-->0) {
            int N = inp.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = inp.nextInt();
            }
            checkSortedAndRotated(arr);
        }
    }

    public static void checkSortedAndRotated(int[] arr){
        int count = 0;
        if(arr[0]>arr[arr.length-1]){
            // increasing sequence
            for(int i=1;i< arr.length;i++){
                if(arr[i]<arr[i-1])
                    count++;
            }
        }else{
            for(int i=1;i< arr.length;i++){
                if(arr[i]>arr[i-1])
                    count++;
            }
        }
        if(count > 1)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}
