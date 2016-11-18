package demo.point;

import java.util.ArrayList;

/**
 * Created by Lisa on 11/18/2016.
 */
public class TestPoint {
    public static void main(String[] args) {
        ArrayList points = new ArrayList();
        Point p1 = new Point(2, 5);
        ColourPoint cp1 = new ColourPoint(2, 5, ColourPoint.Colour.GREEN);
        ColourPoint cp2 = new ColourPoint(2, 5, ColourPoint.Colour.RED);

        points.add(p1);
        points.add(cp1);
        points.add(cp2);

        System.out.println(points.contains(cp1));
        System.out.println(cp1.equals(cp2));

    }
}
