package package1;

public class P1_Class1 {

    public int num1;
    private int num2 = 100;
    protected int num3;
    int num4; // default

    public static void main(String[] args) {
        P1_Class1 obj = new P1_Class1();
        obj.num1 = 10;
//        obj.num2 = 101;
        obj.num3 = 100;
        obj.num4 = 100;

        System.out.println(obj.num2);
    }

    //Getter
    public int getNum2() {
        return num2;
    }

    // Setter
    public void setNum2(int num2){
        if(num2%2 == 0)
            this.num2 = num2;
    }
}
