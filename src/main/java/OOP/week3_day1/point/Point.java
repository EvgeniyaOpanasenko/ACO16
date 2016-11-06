package OOP.week3_day1.point;

/**
 * Created by Lisa on 11/4/2016.
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "x " + "y";
     }

    @Override
    public boolean equals(Object obj) {
        // по сути мі простодолжні віяснить есть наш обж
        // частью поинта И равно ли передаваемому обьекту
        if (obj == null) return false;
        if (obj instanceof Point && this == obj) {
            return true;
        } else {
            return false;
        }
    }
}
