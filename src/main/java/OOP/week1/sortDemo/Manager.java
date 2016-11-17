package OOP.week1.sortDemo;

/**
 * Created by Lisa on 11/17/2016.
 */
public class Manager extends Employee {
    private int workers;

    public Manager(int id, String name, int age, long salary, int workers) {
        super(id, name, age, salary);
        this.workers = workers;
    }


}
