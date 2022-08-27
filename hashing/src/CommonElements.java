import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
// I/P: 1,2,2,4,5,6,6,9
// O/P: 2,6
public class CommonElements {

    public static void main(String[] args) {

        int[] arr = {1,2,2,4,5,6,6,9};
        System.out.println(findDuplicateElements(arr));
    }

    public static ArrayList<Integer> findDuplicateElements(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> resList = new ArrayList<>();
        for(int i: arr){
            if(set.contains(i)){
                resList.add(i);
            }else{
                set.add(i);
            }
        }
        return resList;
    }
}
