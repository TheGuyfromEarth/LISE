public class Test {

    public static void main(String[] args) {

//        HCF hcfObject = new HCF();

        int a = 12;
        int b = 18;

//        System.out.println(hcfObject.hcf(a,b));
        System.out.println(HCF.hcf(a,b));

        // HCF of 8,12 and 20
        int res = HCF.hcf(8,12);
        System.out.println(HCF.hcf(res,20));
    }
}
