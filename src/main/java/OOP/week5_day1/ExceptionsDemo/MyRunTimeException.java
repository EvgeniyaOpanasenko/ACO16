package OOP.week5_day1.ExceptionsDemo;

/**
 * Created by Lisa on 11/5/2016.
 */
public class MyRunTimeException extends RuntimeException {

    public MyRunTimeException() {
    }

    public MyRunTimeException(String message) {
        super(message);
    }

}
