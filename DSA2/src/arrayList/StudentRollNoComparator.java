package arrayList;

import java.util.Comparator;

public class StudentRollNoComparator implements Comparator<Student> {


    @Override
    public int compare(Student std1, Student std2) {
        return std2.rollNo - std1.rollNo;
    }
}
