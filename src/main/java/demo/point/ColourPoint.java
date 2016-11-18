package demo.point;

/**
 * Created by Lisa on 11/18/2016.
 */
public class ColourPoint extends Point {
    Colour colour;
    public ColourPoint(int x, int y, Colour colour) {
        super(x, y);
        this.colour = colour;
    }

    public enum Colour{
        RED, GREEN;
    }

    @Override
    public String toString() {
        return "ColourPoint{" +
                "colour=" + colour +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof ColourPoint)) return false;
        if (!super.equals(o)) return false;

        ColourPoint that = (ColourPoint) o;

        return colour == that.colour;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + colour.hashCode();
        return result;
    }
}
