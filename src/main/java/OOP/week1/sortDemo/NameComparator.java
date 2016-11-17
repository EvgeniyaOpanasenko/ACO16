package OOP.week1.sortDemo;

import java.util.Comparator;

/**
 * Created by Lisa on 11/17/2016.
 */
public class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.getAge(), o2.getAge());
    }
}
