package searchAlgorithms;

// Given an array having some repeated elements inside it. We need to
// return the highest index of that particular element present in the
// array.

// EX:
// arr[] = 5   5  17   17   17   25    45   45  45   45   89
// val = 45
// O/P = 9

public class HighestIndex {

    public static void main(String[] args) {
        int[] arr = {5, 5, 17, 17, 17, 25, 45, 45, 45, 45, 89};
        int val = 45;
        System.out.println(highestIndex(arr,val));
    }
    private static int highestIndex(int[] arr, int val){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        int highestIndex = -1;

        while(low<=high){

            mid = (low+high)/2;

            if(arr[mid] < val){
                low = mid + 1;
            } else if (arr[mid] > val) {
                high = mid - 1;
            }
            else{
                // match
                highestIndex = mid;
                low = mid+1;
            }
        }
        return highestIndex;
    }
}
