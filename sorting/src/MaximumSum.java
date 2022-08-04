import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaximumSum {
    public static void main (String[] args) {
        // Your code here

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(splitSum(arr,n));
    }

    private static int splitSum(int[] arr, int n){

        if(arr.length == 0)
            return 0;

        if(arr.length == 1)
            return arr[0];

        int lp = arr[0];
        int rp = arr[n-1];
        int i = 1;
        int j = n-2;
        int res = 0;

        while(i<=j){

            if(lp == rp)
                res = lp;

            if(lp < rp){
                lp += arr[i++];
            }
            else{
                rp += arr[j--];
            }

        }

        if(lp == rp)
            res = lp;

        return res;
    }
}
