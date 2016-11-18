package demo.singletone;

/**
 * Created by Lisa on 11/18/2016.
 */
public class ThreadSafeSingletoneInsideIf {
    private static ThreadSafeSingletoneInsideIf instance;

    private ThreadSafeSingletoneInsideIf(){}

    public synchronized ThreadSafeSingletoneInsideIf getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingletoneInsideIf();
        }
        return instance;
    }
}
