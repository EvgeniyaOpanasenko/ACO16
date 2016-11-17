package homeWork.week1.car;

/**
 * Created by Lisa on 11/14/2016.
 * Cоздать объект класса Автомобиль, используя классы Колесо, Двигатель.
 Методы: ехать, заправляться, менять колесо, вывести на консоль марку ав-
 томобиля.
 */
public class Car  {
    private String name;
    private Engine engine;
    private Wheel wheel;

    public Car(String name, Engine engine, Wheel wheel) {
        this.name = name;
        this.engine = engine;
        this.wheel = wheel;
    }

    public void drive (Car car){
        System.out.println("this car is moving");
    }

    public void fuelIn(Car car){
        System.out.println("this car is on station");
    }

    public void changeWheel(Car car){
        System.out.println("Wheel is changed");
    }

    @Override
    public String toString() {
        return "Car " +
                "model='" + name;
    }
}

