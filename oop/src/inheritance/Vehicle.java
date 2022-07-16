package inheritance;

// Inheritance (IS A Relationship)
// Parent class or super class
public class Vehicle {

    public String color;
    private Double efficiency;
    String brand;
    protected boolean hasFogLamps;

    public Vehicle(){}


    public void move(){
        System.out.println("The vehicle moves");
    }

    // psf (private, static and final) -> cannot be overridden
    public int numOfTyres(){
        return -1;
    }
}

// Relationships in Java:
// 1) Inheritance
// 2) Aggregation
// 3) Composition