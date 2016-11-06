package OOP.wee4_day2.demo;

import java.util.Collection;
import java.util.List;

/**
 * Created by Lisa on 11/3/2016.
 */
public class SomeType <T> {

    public <E> void rest (Collection<E>coleection){
        for (E e : coleection){
            System.out.println(e);
        }
    }

    public void test(List<Integer> list ){
        for (Integer i : list){
            System.out.println(i);
        }
    }

}
