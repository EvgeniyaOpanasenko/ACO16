package OOP.week5_day1.ExceptionsDemo;

/**
 * Created by Lisa on 11/5/2016.
 */
public class TestExceptions {
    public static void main(String[] args)  {
        try{
            loop();
        } catch (MyException e){
            System.out.println(e.getMessage());
        }


    }

    private static void loop() throws MyException {
        for (int i = 0; i < 100; i++){
            if ( i == 13){
                throw new MyException("exception no 13!");
            }
            System.out.println(i);
        }
    }
}
