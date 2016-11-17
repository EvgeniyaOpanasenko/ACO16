package homeWork.week1.demoHashCodeEquals;

/**
 * Created by Lisa on 11/16/2016.
 */
public class Car {
    private String name;
    private int number;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (number != car.number) return false;
        return name.equals(car.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + number;
        return result;
    }
}
