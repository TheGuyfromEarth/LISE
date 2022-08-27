// I/P: 9,2,2,6,5,6,6,9
// O/P: 6

import java.util.HashMap;

public class HighestFrequency {
    public static void main(String[] args) {
        int[] arr = {9, 2, 2, 6, 5, 6, 6, 9};
        System.out.println(highestFrequency(arr));
    }

    public static int highestFrequency(int[] arr) {

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // putting numbers from array into the map along with count value
        for (int i : arr) {
//            if (freqMap.containsKey(i)) {
////                int orgVal = freqMap.get(i);
//                freqMap.put(i, freqMap.get(i) + 1);
//            } else {
//                freqMap.put(i, 1);
//            }
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        }

        // looping across map to fetch the max key
        int maxKey = arr[0];
        int maxVal = freqMap.get(maxKey);
        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) > maxVal) {
                maxKey = key;
                maxVal = freqMap.get(key);
            }
        }
        return maxKey;
    }
}
