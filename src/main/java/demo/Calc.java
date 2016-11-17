package demo;

/**
 * Created by Lisa on 11/12/2016.
 */
public class Calc {
    private int a;
    private int b;

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static int sum(int a, int b) {
        return a+b;
    }

    public static int div(int i, int i1) {
        return i/i1;
    }
}
