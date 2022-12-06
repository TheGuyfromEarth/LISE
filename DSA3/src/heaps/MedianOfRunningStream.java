package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfRunningStream {
    static PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> minPQ = new PriorityQueue<>();
    public static void main(String[] args) {
        insertNum(10);
        insertNum(10);
        insertNum(10);
        insertNum(10);
        System.out.print("Median ? ");
        System.out.println(findMedian());
        insertNum(18);
        insertNum(25);
        System.out.print("Median ? ");
        System.out.println(findMedian());
    }
    
    public static void insertNum(int num){
        // we will give preference to the max heap
        if(maxPQ.isEmpty() || num<maxPQ.peek())
            maxPQ.add(num);
        else
            minPQ.add(num);

        // correcting the sizes to balance the heaps
        if(maxPQ.size()>minPQ.size()+1){
            minPQ.add(maxPQ.poll());
        }
        else if(minPQ.size()> maxPQ.size()){
            maxPQ.add(minPQ.poll());
        }
    }

    public static double findMedian(){
        // when size of both heaps are equal
        if(maxPQ.size() == minPQ.size())
            return (maxPQ.peek()+ minPQ.peek())/2;
        else
            return maxPQ.peek();
    }
}

// 10,30    40,45