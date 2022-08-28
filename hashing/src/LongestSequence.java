// 2,5,3,10,8,11,1,20,6
// O/P -> 1,2,3

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LongestSequence {
    public static void main(String[] args) {
        int[] arr = {2,5,3,10,8,11,1,20,6,4};
        System.out.println(getLongestSequence(arr));
    }

    public static ArrayList<Integer> getLongestSequence(int[] arr){

        Map<Integer,Boolean> numMap = new HashMap<>();
        ArrayList<Integer> resList =  new ArrayList<>();
        // put all the elements from the array with value as true by default
        for(int i: arr)
            numMap.put(i,true);

        for(int i: arr){
            if(numMap.containsKey(i-1))
                numMap.put(i,false);
        }

        int maxSeqStPoint = Integer.MIN_VALUE;
        int maxSeqSize = 0;

        for(int i:arr){
            if(numMap.get(i)==true){
                int stPoint = i;
                int size = 1;
                while (numMap.containsKey(stPoint+1)){
                    size++;
                    stPoint++;
                }
                if(maxSeqSize<size) {
                    maxSeqSize = size;
                    maxSeqStPoint = i;
                }
            }
        }

        for(int i=maxSeqStPoint;i<=maxSeqSize;i++){
            resList.add(i);
        }
        return resList;
    }
}
