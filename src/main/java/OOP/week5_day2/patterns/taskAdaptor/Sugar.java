package OOP.week5_day2.patterns.taskAdaptor;/** * Created by Lisa on 11/6/2016. */public class Sugar {    private String name;    private int price;    public Sugar(String name, int price) {        this.name = name;        this.price = price;    }    public Sugar() {    }    @Override    public String toString() {        return "Sugar{" +                "name='" + name + '\'' +                ", price=" + price +                '}';    }}