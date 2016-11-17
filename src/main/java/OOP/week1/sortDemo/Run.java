package OOP.week1.sortDemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Lisa on 11/17/2016.
 */
public class Run {
    public static void main(String[] args) {
        ArrayList employee = new ArrayList<Employee>();
        Employee e1 = new Employee(5, "Alisa", 12, 5);
        Employee e6 = new Employee(6, "Alisa", 12, 5);
        Employee e2 = new Employee(4, "Boris", 11, 4);
        Employee e3 = new Employee(3, "Avrora", 13, 3);
        Employee e4 = new Employee(2, "Kate", 10, 23);
        Employee e5 = new Employee(1, "Yaroslav", 8, 28);

        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        employee.add(e4);
        employee.add(e5);
        employee.add(e6);

        employee.sort(new ComrartorBySalary());
        System.out.println(employee);
        employee.sort(new CompareByName());
        System.out.println(employee);




    }
}
