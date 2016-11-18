package demo.singletone;

/**
 * Created by Lisa on 11/18/2016.
 */
public class LazySingletone {
    private static LazySingletone instance;

    private LazySingletone(){}

    public static LazySingletone getInstance(){
        if(instance == null){
            instance = new LazySingletone();
        }
        return instance;
    }
}
