package OOP.week4_day1;

import java.util.List;

/**
 * Created by Lisa on 10/29/2016.
 */
public class Utils {
    public static <T extends Product> boolean find(List<T> list, T product){
        return true;
    }

    public static void copy(List<? extends Product>src, List<? super Product> pd){
        for (Product p : src){
            pd.add(p);
        }
    }
}