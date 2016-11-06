package OOP.week3_day1.point;

/**
 * Created by Lisa on 11/4/2016.
 */
public class ColourPoint extends Point {
    Colour colourPoint;

    public ColourPoint(int x, int y, Colour colour) {
        super(x, y);
        colourPoint = colour;
    }

    @Override
    public boolean equals(Object obj) {

         // как переопределить метод используя иквалс из суперкласса ПОИНТ?
        if (!(obj instanceof Point || obj != null)) return false;
        if (obj instanceof Point && this == obj) {
            return true;
        } else {
            return false;
        }

    }
// привально ли я сдела enum?
    enum Colour {
        GREEN,
        RED
    }
}
