package OOP.week4_day1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa on 10/29/2016.
 */
public class RawType {
    public static void main (String args []){
        List rawType = new ArrayList();
        List<String> list = new ArrayList();

        rawType.add(1);
        rawType.add("1");

        rawType = list;

        rawType.add(1);

        System.out.print(list);


    }
}