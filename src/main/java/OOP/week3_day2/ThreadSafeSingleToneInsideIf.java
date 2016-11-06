package OOP.week3_day2;

import OOP.week3_day2.SingleToneDemo.ThreadSafeSingleTone;

/**
 * Created by Lisa on 11/4/2016.
 */
public class ThreadSafeSingleToneInsideIf {
    private ThreadSafeSingleToneInsideIf instance;

    public ThreadSafeSingleToneInsideIf(){}

    public ThreadSafeSingleToneInsideIf getInstance(){
        if (instance == null){
            synchronized (ThreadSafeSingleTone.class){
                instance = new ThreadSafeSingleToneInsideIf();
            }
        }
        return instance;
    }

}

