package OOP.week3_day2.SingleToneDemo;

/**
 * Created by Lisa on 11/4/2016.
 */
public class SingleTone {

    private static SingleTone instance = new SingleTone();

    private SingleTone(){

    }

    public static SingleTone getInstance (){
        return instance;
    }
}
