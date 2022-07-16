package constructorCall;

public class Smartphone extends Phone {

    double cameraMP;

    public Smartphone(String color, String brand, double cameraMP){
        super(brand,color);
        this.cameraMP = cameraMP;
    }

    public Smartphone(){

    }

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Black","Samsung",64);
        Smartphone smartphone1 =  new Smartphone();
    }
}
