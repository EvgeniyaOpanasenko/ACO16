package OOP.week1.sortDemo;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Comparator;

/**
 * Created by Lisa on 11/17/2016.
 */
public class CompareByName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int res = o1.getName().compareTo(o2.getName());
        if (res != 0) return res;
        return o1.getId() -o2.getId();
    }
}
