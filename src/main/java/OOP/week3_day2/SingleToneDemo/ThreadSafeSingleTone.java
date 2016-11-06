package OOP.week3_day2.SingleToneDemo;

/**
 * Created by Lisa on 11/4/2016.
 */
public class ThreadSafeSingleTone {
    private static ThreadSafeSingleTone instance;

    public ThreadSafeSingleTone(){}

    public synchronized ThreadSafeSingleTone getInstance(){
        if (instance == null){
            instance= new ThreadSafeSingleTone();
        }
        return instance;
    }
}
