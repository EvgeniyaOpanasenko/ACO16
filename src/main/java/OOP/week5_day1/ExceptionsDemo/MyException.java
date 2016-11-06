package OOP.week5_day1.ExceptionsDemo;

/**
 * Created by Lisa on 11/5/2016.
 */
public class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
