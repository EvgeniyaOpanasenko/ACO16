package OOP.week3_day1.point;

/**
 * Created by Lisa on 11/4/2016.
 */
public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point(2,5);
        ColourPoint cp1 = new ColourPoint(2,5, ColourPoint.Colour.GREEN);
        ColourPoint cp2 = new ColourPoint(2,5, ColourPoint.Colour.RED);

        System.out.println(cp1.equals(cp2));





    }
}
