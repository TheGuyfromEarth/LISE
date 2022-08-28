// 9,2,2,6,5,6,4,9
// k = 3
// O/P -> 2,2,3,2,3,3

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistinctNumbersInKSizeWindow {
    public static void main(String[] args) {
        int[] arr = {9,2,2,6,5,6,4,9};
        int k = 3;
        System.out.println(distinctNumbers(arr,k));
    }

    public static List<Integer> distinctNumbers(int[] arr, int k){
        Map<Integer,Integer> freqMap = new HashMap<>();
        ArrayList<Integer> resList = new ArrayList<>();
        // put first k numbers inside the freqMap using the acquire pointer
        int acquire = 0;
        int release = -1;

        for(;acquire<k;acquire++){
            freqMap.put(arr[acquire], freqMap.getOrDefault(arr[acquire],0)+1);
        }

        resList.add(freqMap.size());

        for(;acquire<arr.length;acquire++){
            // release and remove from freqMap
            release++;
            int val = freqMap.get(arr[release]);
            if(val == 1)
                freqMap.remove(arr[release]);
            else{
                freqMap.put(arr[release],val-1);
            }
            // acquire and put in freqMap
            freqMap.put(arr[acquire], freqMap.getOrDefault(arr[acquire],0)+1);
            resList.add(freqMap.size());
        }
        return resList;
    }
}