import java.util.ArrayList;
import java.util.HashSet;

// I/P: arr1 => 9,2,2,6,5,6,4,9
//      arr2 => 8,4,1,6,6,2,4,2
// O/P for 1st Part => 2,6,4
// O/P for 2nd Part => 4,6,6,2,2
public class FindCommonElementsInTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {9,2,2,6,5,6,4,9};
        int[] arr2 = {8,4,1,6,6,2,4,2};
        System.out.println(getCommonElements(arr1,arr2));
    }

    public static ArrayList<Integer> getCommonElements(int[] arr1, int[] arr2){
        HashSet<Integer> mySet = new HashSet<>();
        ArrayList<Integer> resList = new ArrayList<>();

        for(int i: arr1)
            mySet.add(i);

        for(int i: arr2){
            if(mySet.contains(i)){
                resList.add(i);
                mySet.remove(i);
            }
        }
        return resList;
    }
}
