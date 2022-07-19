package searchAlgorithms;

// Given an array and a value, return the ceil and floor of the given value from the array

// Ex: 12, 34, 44, 66, 71, 78 , 81
// val = 79
// O/P: floor = 78, ceil = 81

public class CeilAndFloor {

    static int ceil = 0;
    static int floor = 0;

    public static void main(String[] args) {

        int arr[] = {12, 34, 44, 66, 71, 78 , 81};
        int val = 42;
        binarySearch(arr,val);
        System.out.println("Ceil for "+val+" is "+ceil);
        System.out.println("Floor for "+val+" is "+floor);
    }

    private static void binarySearch(int[] arr, int val){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){

            int mid = (low+high)/2;

            if(arr[mid] == val)
            {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }else if(arr[mid] < val){
                floor = arr[mid];
                low = mid+1;
            }
            else{
                ceil = arr[mid];
                high = mid-1;
            }
        }
    }
}
