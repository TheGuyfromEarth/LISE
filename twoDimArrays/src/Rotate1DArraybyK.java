// arr = {20,10,8,-10,2,78,36,11,1}
// k = 4 (No of rotations)
// OP -> {78,36,11,1,20,10,8,-10,2}

import java.util.Arrays;

public class Rotate1DArraybyK {

    public static void main(String[] args) {
        // Inputs
        int[] arr = {20,10,8,-10,2,78,36,11,1};
        int k = 4;

        // Solution
        int n = arr.length;
        int part1EndIndx = n-k-1;
        int part2BegIndx = n-k;

        // reverse part1
        reverse(arr,0,part1EndIndx);
        // reverse part2
        reverse(arr,part2BegIndx,n-1);
        // reverse entire array
        reverse(arr,0,n-1);

        System.out.println(Arrays.toString(arr));

    }

    private static void reverse(int[] arr,int low,int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
