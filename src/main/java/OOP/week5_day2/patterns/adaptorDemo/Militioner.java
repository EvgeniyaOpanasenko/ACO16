package OOP.week5_day2.patterns.adaptorDemo;

/**
 * Created by Lisa on 11/6/2016.
 */
public class Militioner {
    private String name;
    private String rang;


    public Militioner(String name, String rang) {
        this.name = name;
        this.rang = rang;
    }

    public Militioner() {

    }

    @Override
    public String toString() {
        return "Militioner{" +
                "name='" + name + '\'' +
                ", rang='" + rang + '\'' +
                '}';
    }

    public void takeBribe(){
        System.out.println("I toock my bribe ");
    }
}
