package OOP.week1.student;

import java.util.Comparator;

/**
 * Created by Lisa on 11/17/2016.
 */
public class AverageMarkComparator implements Comparator<Student> {


    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student1.getMark(),student2.getMark());
    }
}
