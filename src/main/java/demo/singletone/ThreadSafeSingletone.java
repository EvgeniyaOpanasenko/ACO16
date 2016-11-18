package demo.singletone;

/**
 * Created by Lisa on 11/18/2016.
 */
public class ThreadSafeSingletone {
    private static ThreadSafeSingletone instance;

    private ThreadSafeSingletone(){}

    public synchronized ThreadSafeSingletone getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingletone();
        }
        return instance;
    }
}
