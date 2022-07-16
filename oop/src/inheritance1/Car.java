package inheritance1;

import inheritance.Vehicle;

// Child class or sub class or derived class
public class Car extends Vehicle {

    @Override
    public int numOfTyres() {
        return 4;
    }

    public static void main(String[] args) {
        // 1
        Car creta = new Car();
        creta.color = "White";
//        creta.brand = "Hyundai";
        creta.hasFogLamps = false;

//        System.out.println(creta.numOfTyres());

        // 2
        Vehicle vehicle = new Vehicle();
//        System.out.println(vehicle.numOfTyres());

        // 3
        Vehicle audi = new Car();
        System.out.println(audi.numOfTyres()); // dynamic polymorphism

        // 4
//        Car suzuki = new Vehicle(); // Does not work

    }
}



//class Phone{
//
//}
//
//class Smartphone extends Phone{
//
//}
//
//class FeaturePhone extends Phone{
//
//}