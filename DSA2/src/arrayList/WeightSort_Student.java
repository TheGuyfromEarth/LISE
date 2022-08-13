package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Student implements Comparable<Student>{
    int rollNo;
    double weight;
    String name;

    public Student(int rollNo, double weight, String name) {
        this.rollNo = rollNo;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return (int) (this.weight - student.weight);
    }
}

public class WeightSort_Student {

    public static void main(String[] args) {

        ArrayList<Student> stdList = new ArrayList<>();
        Student std1 = new Student(1,67,"Rahul");
        stdList.add(std1);
        stdList.add(new Student(2,50,"Aradhna"));
        stdList.add(new Student(3,100,"Zoey"));
        stdList.add(new Student(4,81,"Bob"));

//        System.out.println("Weights before sorting: ");
//        System.out.println(stdList);
//        System.out.println("Weights after sorting: ");
//        Collections.sort(stdList);
//        System.out.println(stdList);

        System.out.println("Students in descending order of roll numbers before sorting: ");
        System.out.println(stdList);
        System.out.println("Students in descending order of roll numbers after sorting: ");
        Collections.sort(stdList,new StudentRollNoComparator());
        System.out.println(stdList);

        System.out.println("Students in ascending order of student names before sorting: ");
        System.out.println(stdList);
        System.out.println("Students in ascending order of student names after sorting: ");
        Collections.sort(stdList,new StudentNameComparator());
        System.out.println(stdList);

    }
}


// 1) child class wants to use the features of parent class (inheritance) -> extends
// 2) a child interface wants to use the features of parent interface (inheritance) -> extends
// 3) a class needs to use the features of an interface -> implements


