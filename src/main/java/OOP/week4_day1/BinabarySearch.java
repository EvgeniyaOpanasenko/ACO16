package OOP.week4_day1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa on 10/29/2016.
 */
public class BinabarySearch {
    public static void main (String args []){
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(binarySerach(list, 2));


    }

    public static boolean binarySerach (List list, Comparable key) {
        if (list == null || key == null) return false;

        int start = 0;
        int mid = list.size() / 2;
        int end = list.size() - 1;

        while (end != start){
           int result = key.compareTo(list.get(mid));
            if ( result > 0){
                start = mid + 1;
            }if (result < 0){
                end = mid -1;
            }else{
                return true;
            }
            mid = start + (end - start) / 2;
        }

        return false;
   }
}



