package heaps;
// There are N ropes present, the length of which is mentioned in the array individually. You have to connect N ropes
// together and create one single rope. The ropes must be connected two at a time, and the cost of connecting two ropes
// is the sum of the length of the two ropes. Find the min possible cost of connecting N ropes.

import java.util.PriorityQueue;

public class ConnectNRopesWithMinCost {
    public static void main(String[] args) {
        int[] arr = {1,4,8,10,3,6};
        System.out.println(minCost(arr));
    }

    public static int minCost(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i: arr)
            pq.add(i);

        int cost = 0;
        while(pq.size()>1) {
            int rope1 = pq.poll();
            int rope2 = pq.poll();
            int sum = rope1 + rope2;
            cost += sum;
            pq.add(sum);
        }
        return cost;
    }
}




// x, y and z

// x>y>z

// Case 1: a) (x+y)
//         b) (x+y)+z
// Cost -> (x+y)+(x+y)+z = 2x+2y+z

// Case 2: a) (y+z)
//         b) x+(y+z)
// Cost -> (y+z)+x+(y+z) = x+2y+2z