public class Tester {

    public static void main(String[] args) {

        QueueUsingCircularArray queue = new QueueUsingCircularArray(4);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(60);
//        queue.traverse();
//        queue.add(100);
//        queue.traverse();
        System.out.println(queue.remove());
//        queue.traverse();
        queue.add(80);
//        queue.traverse();
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        queue.traverse();


    }
}
