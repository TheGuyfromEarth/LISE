public class Student {

    public static void main(String[] args) {

        String name = "Larry";
        int age = 19;
        String address = "3rd Street";
        double percent = 91.1;

        isEligible(name,age,percent);

        String name1 = "Matt";
        int age1 = 17;
        String address1 = "3rd Street";
        double percent1 = 99;

        isEligible(name1,age1,percent1);
    }

    private static void isEligible(String name,int age, double percent){
        if(age>=18 && percent>=90)
            System.out.println(name+" Gets admission");
        else
            System.out.println(name+" Does not get admission");
    }


}
