package homeWork.week1.puppy;

/**
 * Created by Lisa on 11/14/2016.
 */
public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "my name is " + name;
    }

    public void run(Animal animal){
        System.out.println("I'm running");
    }

    public void barking(Animal animal){
        System.out.println("I'm barking");
    }

    public void jumping(Animal animal){
        System.out.println("I'm jumping");
    }

    public void bite(Animal animal){
        System.out.println("I'm biting");
    }


}
