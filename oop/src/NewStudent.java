public class NewStudent {

    // class can have class members:
    // 1) class variables (features)
    // 2) class methods (behaviors)

    // class variables or attributes or instance variables
    private String name ;
    int age;
    String address;
    double percent;

    // Constructor-> Special Method which has same name as the class name.
    // It does not have a return type. It is responsible for creating objects, essentially
    // initialising objects.

    // default constructor (parameterless constructor)
    public NewStudent(){
        System.out.println("Constructor called");
    }

    // parametrized constructor
    public NewStudent(String nm, int ag, String add, double percent){
        this.name = nm;
        age = ag;
        address = add;
        this.percent = percent;
    }

    // class method
    private void isEligible(){
        if(age>=18 && percent>=90)
            System.out.println(name+" Gets admission");
        else
            System.out.println(name+" Does not get admission");
    }

    public static void main(String[] args) {

        //object
        NewStudent stud1 = new NewStudent(); // default constructor call
        stud1.name = "Larry";
        stud1.age = 19;
        stud1.address = "123 Street";
        stud1.percent = 91.1;

        stud1.isEligible();

        NewStudent stud2 = new NewStudent("Kelly", 21,"124 Street",90);

//        isEligible(stud2.name,stud2.age,stud2.percent);
        stud2.isEligible();
    }

}
