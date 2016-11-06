package OOP.week3_day2.SingleToneDemo;

/**
 * Created by Lisa on 11/4/2016.
 */
public class LazySingletone {

    private static LazySingletone instance;

    public LazySingletone(){

    }

    public LazySingletone getInstance(){
        if (instance == null){
            instance = new LazySingletone();
        }
        return instance;
    }

}