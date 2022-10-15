import java.util.*;

public class SortByFrequency {

    public static void main(String[] args) {
        int[] arr = {2,2,5,9,4,5,9,9,5};
        sortByFrequency(arr);
    }

    public static void sortByFrequency(int[] arr){
        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int i: arr){
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        }
        ArrayList<Pair> pairList = new ArrayList<>();
        for(Map.Entry<Integer,Integer> pair: freqMap.entrySet()){
            int key = pair.getKey();
            int val = pair.getValue();
            pairList.add(new Pair(key,val));
        }

        Collections.sort(pairList);
        for (Pair pair: pairList){
            int count = 0;
            while(count<pair.val) {
                System.out.print(pair.key + " ");
                count++;
            }
        }
//        Collections.sort(freqMap.values().stream().toList(),new ElementComparator());
    }
}

class Pair implements Comparable<Pair>{
    // Pair A
    int key;// 1
    int val;// 3

    public Pair(int k,int v){
        key = k;
        val = v;
    }

    @Override// key -> 3 val -> 1 (Pair B)
            // key -> 0 val -> 3 (Pair C)
    public int compareTo(Pair other) {
        int res = other.val - this.val;
        if(res == 0)
            return other.key > this.key? 1:-1;

        return res;
    }
}


// class Name implements Comparable<Name>{
//   String firstName;
//   String lastName;
//public int compareTo(Name other) {
//    int res = this.firstName - other.firstName;
//    if(res == 0)
//        return other.lastName > this.lastName? -1:1;
//
//    return res;
//}
//}


// List of 10 names


