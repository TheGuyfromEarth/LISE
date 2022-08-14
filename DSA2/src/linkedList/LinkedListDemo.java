package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(10);
        myList.add(20);
        myList.add(5);
        myList.add(9);
        myList.add(30);

        myList.remove(0);
        myList.set(3,100);

        LinkedList<Integer> yourList = new LinkedList<>();
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.addAll(myList);
//        yourList.addAll(myList);
//        System.out.println(yourList);
        System.out.println(arrList);

//        myList.addFirst(-19);
//        myList.addLast(0);
//
//        myList.removeFirst();
//        myList.removeLast();
//
//        System.out.println(myList.contains(9));
//
//        System.out.println(myList.isEmpty());
//        myList.clear();
//        System.out.println(myList.isEmpty());
//
//        System.out.println(myList);
//        System.out.println(myList.size());



    }
}
