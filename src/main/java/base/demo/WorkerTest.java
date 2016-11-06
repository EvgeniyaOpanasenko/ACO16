package base.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Lisa on 10/31/2016.
 */
public class WorkerTest {
    public static void main(String args[]) {
        List<Worker> stud = new ArrayList<>();

        stud.add(new Worker("Alan", 85, "alan4@gmail.com"));
        stud.add(new Worker("Petrov", 30, "petrov@gmail.com"));
        stud.add(new Worker("Sidorov", 55, "sidorov@gmail.com"));
        stud.add(new Worker("Ivanov", 22, "ivanov@gmail.com"));
        stud.add(new Worker("Alan", 37, "alan1@gmail.com"));

        System.out.println("dont sort");
        System.out.println(stud);

        System.out.println("sort by name");
        Collections.sort(stud, SortWorker.sortByAge);
        System.out.println(stud);

        System.out.println("sort by age");
        Collections.sort(stud, SortWorker.sortByName);
        System.out.println(stud);

        System.out.println("sort by name and age");
        Collections.sort(stud, SortWorker.sortByNameAge);
        System.out.println(stud);


    }
}