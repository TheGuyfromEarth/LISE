package priorityQueue;

import java.util.Comparator;

public class FoodComparator implements Comparator<String> {

    @Override
    public int compare(String item1, String item2) {
        return item1.length()-item2.length();
    }
}
