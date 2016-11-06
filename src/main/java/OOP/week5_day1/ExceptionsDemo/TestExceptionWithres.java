package OOP.week5_day1.ExceptionsDemo;

import java.util.Scanner;

/**
 * Created by Lisa on 11/5/2016.
 */
public class TestExceptionWithres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try{
            sc.nextInt();
        }catch(IllegalArgumentException e){
            System.out.println("exception");
        }finally {
            sc.close();
        }

    }
}
