// Make the test class as immutable

public final class Test {

    public String var;

    public Test(String value){
        var = value;
    }

    public Test modify(String newVal){
        if(var.equals(newVal))
            return this;
        else{
           return new Test(newVal);
        }
    }

    public static void main(String[] args) {
        Test obj = new Test("java");
        System.out.println(obj.var);
        Test newObj = obj.modify("php");
        System.out.println(newObj.var);
        obj.modify("java");
        System.out.println(obj.var);
    }
}

//class Child extends Test{
//
//    Child(){
//        super("javascript");
//    }
//
//    public static void main(String[] args) {
//        Child child = new Child();
//
//        child.var = "";
//        child.modify("");
//    }
//}