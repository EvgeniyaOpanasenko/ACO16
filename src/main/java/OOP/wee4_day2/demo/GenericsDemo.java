package OOP.wee4_day2.demo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Lisa on 11/3/2016.
 */
public class GenericsDemo {
    public static void main(String[] args) {
        SomeType someType = new SomeType();
        List <String> list = Arrays.asList("value");

        someType.test(list);


    }
}
