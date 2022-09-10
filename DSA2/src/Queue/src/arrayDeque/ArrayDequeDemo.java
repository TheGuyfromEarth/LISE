package arrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

    public static void main(String[] args) {
        ArrayDeque<Integer> arrDeque = new ArrayDeque<>();
        // Use ArrayDeque as a Stack
//        arrDeque.push(10);
//        arrDeque.push(20);
//        arrDeque.push(30);
//
//        System.out.println(arrDeque.pop());
//        System.out.println(arrDeque);

        // Use ArrayDeque as a Queue
//        arrDeque.add(10);
//        arrDeque.add(20);
//        arrDeque.add(40);
//        System.out.println(arrDeque);
//        System.out.println(arrDeque.remove());
//        System.out.println(arrDeque);

        arrDeque.add(10);
        arrDeque.addFirst(20);
        arrDeque.addLast(40);
        arrDeque.add(30);
        System.out.println(arrDeque);
        arrDeque.removeLast();
        System.out.println(arrDeque);
    }
}
