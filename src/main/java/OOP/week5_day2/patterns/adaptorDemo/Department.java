package OOP.week5_day2.patterns.adaptorDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa on 11/6/2016.
 */
public class Department {
    private List<Policeman> policemen = new ArrayList<>();

    public Department() {
    }

    public boolean hirePoliceman(Policeman p) {
        return policemen.add(p);
    }

    public void startWorkingDay(){
        System.out.println("I'm a good policeman");
    }
}