package base.demo;

import java.util.Comparator;

/**
 * Created by Lisa on 10/31/2016.
 */
public class SortWorker  {

    public static Comparator<Worker> sortByName = new Comparator<Worker>() {
        @Override
        public int compare(Worker o1, Worker o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Worker> sortByAge = new Comparator<Worker>() {
        @Override
        public int compare(Worker o1, Worker o2) {
            return o1.getAge() - o2.getAge();
        }
    };

    public static Comparator<Worker> sortByNameAge = new Comparator<Worker>() {
        @Override
        public int compare(Worker o1, Worker o2) {
            int res = o1.getName().compareTo(o2.getName());
            if (res == 0){
                res = o1.getAge() - o2.getAge();
            }

            return res;
        }

    };
}
