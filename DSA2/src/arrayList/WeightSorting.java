package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class WeightSorting {

    public static void main(String[] args) {
        ArrayList<Integer> weightList = new ArrayList<>();

        weightList.add(60);
        weightList.add(40);
        weightList.add(90);
        weightList.add(65);
        weightList.add(100);

        System.out.println("Weights before sorting: ");
        System.out.println(weightList);
        System.out.println("Weights after sorting: ");
        Collections.sort(weightList);
        Collections.reverse(weightList);
        System.out.println(weightList);
    }
}
