package OOP.week6_day1;

import OOP.week6_day1.Action;

/**
 * Created by Lisa on 11/12/2016.
 */
public class TimeCheck {
    public long checkTime(Action action){
        long start = System.currentTimeMillis();
        // action
        action.run();
        long end = System.currentTimeMillis();
        return end - start;
    }
}
