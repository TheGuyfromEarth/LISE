package heaps;

import java.util.Arrays;

// Considering a Min Heap
public class InsertionInHeap {

    public static void main(String[] args) {
        int[] arr = {15,30,29,40,60,45};
        int element = 6;
        int[] newArr = createNewArray(arr);
        insert(newArr,element);
        System.out.println(Arrays.toString(newArr));
    }

    public static void insert(int[] newArr, int element){
        newArr[newArr.length-1] = element;
        // heapify process
        int i = newArr.length-1;
        while(i>0){
            int parentIndex = (i-1)/2;
            if(newArr[i] < newArr[parentIndex]){
                // a swap is required
                swap(newArr,i,parentIndex);
                i = parentIndex;
            }else{
                return;
            }
        }
    }

    private static void swap(int[] newArr, int i, int j){
        newArr[i] = newArr[i]^newArr[j];
        newArr[j] = newArr[i]^newArr[j];
        newArr[i] = newArr[i]^newArr[j];
    }

    public static int[] createNewArray(int[] arr){
        int[] newArr = new int[arr.length+1];
        for(int i=0;i< arr.length;i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
