package OOP.wee4_day2;

/**
 * Created by Lisa on 10/30/2016.
 */
public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
