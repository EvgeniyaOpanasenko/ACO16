package homeWork.week1.puppy;

/**
 * Created by Lisa on 11/14/2016.
 * Создать объект класса Щенок, используя классы Животное, Собака.
 Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать.
 */
public class Puppy extends Dog{

    public Puppy(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "I'm puppy. my name is " + getName();
    }

}
