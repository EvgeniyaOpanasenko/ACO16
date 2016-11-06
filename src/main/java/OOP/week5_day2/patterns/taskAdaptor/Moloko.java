package OOP.week5_day2.patterns.taskAdaptor;

/**
 * Created by Lisa on 11/6/2016.
 */
public class Moloko {
    private int price;
    private String name;

    public Moloko( String name , int price) {
        this.price = price;
        this.name = name;
    }

    public Moloko() {
    }

    @Override
    public String toString() {
        return "Moloko{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
