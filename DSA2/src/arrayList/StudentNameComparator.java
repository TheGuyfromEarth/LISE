package arrayList;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {


    @Override
    public int compare(Student std1, Student std2) {
        return std1.name.compareTo(std2.name);
    }
}
