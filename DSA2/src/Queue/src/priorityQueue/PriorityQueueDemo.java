package priorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(100);
        pq.add(-10);
        pq.add(0);

//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.peek());

        PriorityQueue<String> menu = new PriorityQueue<>(new FoodComparator());
        menu.add("Pasta");
        menu.add("PizzaSlice");
        menu.add("Cake");
        menu.add("Yogurt");

        System.out.println(menu.remove());
        System.out.println(menu.remove());
        System.out.println(menu.remove());
        System.out.println(menu.remove());
    }
}
