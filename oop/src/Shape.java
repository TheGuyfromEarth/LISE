public class Shape {

    // area of a rectange
    public double area(int length, double width){
        return length*width;
    }

    // area of triangle
    public double area(double base, int height){
        return 0.5*base*height;
    }

    // area of a square
    public double area(int side){
        return side*side;
    }

    // area of circle
    public double area(double radius){
        return Math.PI*radius*radius;
    }

    public static void main(String[] args) {

        Shape rect = new Shape();
        rect.area(10,20.0);

        Shape circle = new Shape();
        System.out.println(circle.area(10));
    }

}
