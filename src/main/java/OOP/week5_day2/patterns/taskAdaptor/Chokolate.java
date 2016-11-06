package OOP.week5_day2.patterns.taskAdaptor;

/**
 * Created by Lisa on 11/6/2016.
 */
public class Chokolate {
    private int price;
    private String name;

    public Chokolate(String name, int price) {
        this.price = price;
        this.name = name;
    }

    public Chokolate() {
    }

    @Override
    public String toString() {
        return "Chokolate{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
