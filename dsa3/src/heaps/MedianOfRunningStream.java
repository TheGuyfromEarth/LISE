package heaps;

import java.util.ArrayList;
import java.util.List;

public class MedianOfRunningStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(8);
        list.add(20);
        System.out.println("Median ? ");
        System.out.println(findMedian(list));
        list.add(18);
        list.add(25);
        System.out.println("Median ? ");
        System.out.println(findMedian(list));
    }

    public static double findMedian(List<Integer> list){
        return 0.0;
    }
}