package base.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Lisa on 10/31/2016.
 */
public class Sortings {
    public static void main(String[] args) {
        ArrayList <Worker> stud = new ArrayList();

        stud.add(new Worker("Alan", 85, "alan4@gmail.com"));
        stud.add(new Worker("Petrov", 30, "petrov@gmail.com"));
        stud.add(new Worker("Sidorov", 55, "sidorov@gmail.com"));
        stud.add(new Worker("Ivanov", 22, "ivanov@gmail.com"));
        stud.add(new Worker("Alan", 37, "alan1@gmail.com"));

        System.out.println("No sorting");
        System.out.println(stud.toString());

        Comparator<Worker> sortByAge = new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        Collections.sort(stud, sortByAge);
        System.out.println(stud.toString());
    }


}
