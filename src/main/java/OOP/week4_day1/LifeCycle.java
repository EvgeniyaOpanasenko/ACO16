package OOP.week4_day1;

import java.util.Collection;
import java.util.List;

/**
 * Created by Lisa on 10/29/2016.
 */
public class LifeCycle <T> {
    public void show(Collection<T> collection){
        for (T t : collection){
            System.out.print(t);
        }
    }

    public void show(List<Integer> list){
        for (Integer i: list){
            System.out.print(i);
        }
    }

}
