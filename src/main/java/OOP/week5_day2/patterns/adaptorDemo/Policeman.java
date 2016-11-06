package OOP.week5_day2.patterns.adaptorDemo;

/**
 * Created by Lisa on 11/6/2016.
 */
public class Policeman {
    private String name;
    private String rang;

    public Policeman(String name, String rang) {
        this.name = name;
        this.rang = rang;
    }

    public Policeman() {
    }

    @Override
    public String toString() {
        return "Policeman{" +
                "name='" + name + '\'' +
                ", rang='" + rang + '\'' +
                '}';
    }

    public void serve(){
        System.out.println("I'm serving");
    }
}
