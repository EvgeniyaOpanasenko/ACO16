package homeWork.week1.car;

/**
 * Created by Lisa on 11/14/2016.
 */
public class Run {
    public static void main(String[] args) {
        Engine engine = new Engine("engine");
        Wheel wheel = new Wheel("wheel");
        Car car = new Car("ford", engine, wheel);

        System.out.println(car);
        car.drive(car);
        car.changeWheel(car);
        car.fuelIn(car);
    }
}
