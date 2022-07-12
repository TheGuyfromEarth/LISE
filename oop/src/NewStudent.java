public class NewStudent {
    String name ;
    int age;
    String address;
    double percent;

    private static void isEligible(NewStudent std){
        if(std.age>=18 && std.percent>=90)
            System.out.println(std.name+" Gets admission");
        else
            System.out.println(std.name+" Does not get admission");
    }

    public static void main(String[] args) {

        NewStudent stud1 = new NewStudent();
        stud1.name = "Larry";
        stud1.age = 19;
        stud1.address = "123 Street";
        stud1.percent = 91.1;

        isEligible(stud1);

        NewStudent stud2 = new NewStudent();
        stud2.name = "Kelly";
        stud2.age = 17;
        stud2.address = "124 Street";
        stud2.percent = 90;

//        isEligible(stud2.name,stud2.age,stud2.percent);
        isEligible(stud2);
    }

}
