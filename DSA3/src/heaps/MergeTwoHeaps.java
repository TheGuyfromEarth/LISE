package heaps;

import java.util.Arrays;

public class MergeTwoHeaps {
    public static void main(String[] args) {
        int[] arr1 = {1, 10, 20, 34, 19, 40};
        int[] arr2 = {16, 40, 29, 46, 99, 62};
        mergeTwoHeaps(arr1,arr2);
    }

    public static void mergeTwoHeaps(int[] arr1,int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];
        int i=0;
        for(;i< arr1.length;i++)
            arr3[i] = arr1[i];

        for(int j=0;j<arr2.length;j++)
        {
            arr3[i] = arr2[j];
            i++;
        }
        BuildHeap.buildHeap(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
