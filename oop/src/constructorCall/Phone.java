package constructorCall;

public class Phone {

    public String brand;
    public String color;

    public Phone(){
        System.out.println("Phone const called");
    }

    public Phone(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
}
