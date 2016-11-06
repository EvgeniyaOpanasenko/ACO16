package OOP.week5_day2.patterns.adaptorDemo;

/**
 * Created by Lisa on 11/6/2016.
 */
public class TestCity {
    public static void main(String[] args) {
        Department policeDepartment = new Department();

        Policeman p1 = new Policeman();
        Policeman p2 = new Policeman();
        Policeman p3 = new Policeman();

        Militioner m1 = new Militioner();
        Militioner m2 = new Militioner();
        Militioner m3 = new Militioner();

        policeDepartment.hirePoliceman(p1);
        policeDepartment.hirePoliceman(p2);
        policeDepartment.hirePoliceman(p3);
        policeDepartment.hirePoliceman(new PoliceMenAdaptor(m1));
        policeDepartment.hirePoliceman(new PoliceMenAdaptor(m2));
        policeDepartment.hirePoliceman(new PoliceMenAdaptor(m3));

        policeDepartment.startWorkingDay();

    }
}
