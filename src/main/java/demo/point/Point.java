package demo.point;

/**
 * Created by Lisa on 11/18/2016.
 */
public class Point {
    private int x;
    private int y;

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;

        if (!(o instanceof Point)) return false;
        //if (!(this.getClass() == o.getClass()))return false;

        Point p = (Point) o;
        if (this.x != p.x) return false;
        return y == p.y;

    }

    @Override
    public int hashCode() {
        int res;

        return 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
