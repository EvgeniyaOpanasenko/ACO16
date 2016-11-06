package OOP.week5_day1.cloneDemo;

/**
 * Created by Lisa on 11/5/2016.
 */
public class TestMan {
    public static void main(String[] args) throws CloneNotSupportedException {
        Man man = new Man ("Jhon", 56);
        Woman wife = new Woman("Eva", 30);
        Child babe = new Child("Adam", 15);
        man.setWife(wife);
        wife.setChild(babe);
        Person clone = man.clone();


        man.setName("Ivan");
        babe.setName("Kain");

        System.out.println("origin" + man);
        System.out.println("clone " + clone);

        System.out.println(man.getName().compareTo(clone.getName()));

        wife.setName("Angelika");

        System.out.println(wife);
    }
}
