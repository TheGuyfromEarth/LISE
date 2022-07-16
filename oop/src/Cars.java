public class Cars {

    final int maxCapacity = 3;
    static int count; // 0 1 2 3 4 (static counter)

    Cars(){
        count++;
        if(count>maxCapacity)
            System.out.println("Parking full");
        else
            System.out.println(count);
    }

    public static void main(String[] args) {
        Cars car1 = new Cars(); // 775
        Cars car2 = new Cars();
        Cars car3 = new Cars();
        Cars car4 = new Cars(); // output
    }
}


// instance variable -> each object gets its own copy (maintained at object level)
// static variable -> only one variable, no copies (maintained at class level)