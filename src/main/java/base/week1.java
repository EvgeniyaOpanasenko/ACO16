package base;

import java.util.Date;
import java.util.Scanner;


/**
 * Created by Lisa on 10/31/2016.
 */
public class week1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Date currentDate = new Date(System.currentTimeMillis());
        //System.out.println("Current time and date " + currentDate);

        System.out.println("enter smth string");
       String smth = scan.nextLine();

        if (currentDate.getHours() > 18 && currentDate.getHours() < 9){
            System.out.println("I'm not at work");
        }else {
            System.out.println("I'm working");
        }




    }
}
