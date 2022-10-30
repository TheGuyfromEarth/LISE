package trees.segmentTrees;

import java.util.Arrays;

public class RangeSum {

    static int[] segmentArr;

    public static void main(String[] args) {
        int[] arr = {3,5,1,8,6};
        int l = 1;
        int u = 3;
        segmentArr = new int[arr.length*4];
        createSegmentTree(0,0,arr.length-1,arr);
        System.out.println(Arrays.toString(segmentArr));
        System.out.println(querySegmentTree(0, 0, arr.length - 1, l, u));
    }

    // building the segment tree (Array)
    public static void createSegmentTree(int index,int low, int high,int[] arr){
        if(low == high){
            segmentArr[index] = arr[low];
            return;
        }
        int leftChildIndex = 2*index+1;
        int rightChildIndex = 2*index+2;
        int mid = (low+high)>>1;
        createSegmentTree(leftChildIndex,low,mid,arr);
        createSegmentTree(rightChildIndex,mid+1,high,arr);
        segmentArr[index] = segmentArr[leftChildIndex]+segmentArr[rightChildIndex];
    }

    public static int querySegmentTree(int index,int low,int high,int l,int u){
        if((low>u || high<l))
            return 0;
        if(low>=l && high<=u){
            return segmentArr[index];
        }
        // case of overlap
        // go towards both the children
        int mid = (low+high)>>1;
        int leftSum = querySegmentTree(2*index+1,low,mid,l,u);
        int rightSum = querySegmentTree(2*index+2,mid+1,high,l,u);
        return leftSum+rightSum;
    }

}
