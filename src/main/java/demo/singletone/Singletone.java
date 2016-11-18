
package demo.singletone;

/**
 * Created by Lisa on 11/18/2016.
 */
public class Singletone {
    private static Singletone instance = new Singletone();
    private Singletone(){}

    public static Singletone getInstance(){
        return instance;
    }
}
