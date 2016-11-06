package OOP.week5_day1.NestedClassesDemo;

/**
 * Created by Lisa on 11/5/2016.
 */
public class TestShip {
    public static void main(String[] args) {
        Ship.LifeBoat lifeBoat = new Ship.LifeBoat("name");

        Ship.Engine engine = new Ship.Engine("engine");
    }
}
