package package1;

public class P1_Class2 {
    public static void main(String[] args) {
        P1_Class1 obj = new P1_Class1();
        obj.num1 = 10;
//        obj.num2 = 10000;
        obj.num3 = 100;
        obj.num4 = 1000;
        System.out.println(obj.getNum2());
        obj.setNum2(-99);
        System.out.println(obj.getNum2());
//        obj.num2 = 88; // not accessible since private
    }
}
