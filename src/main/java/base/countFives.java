package base;

import java.util.Scanner;

/**
 * Created by Lisa on 10/31/2016.
 */
public class countFives {
    public static void main(String[] args) {
        System.out.println("Enter number");
        String needToFind = "5";

        Scanner scan = new Scanner(System.in);
        String num = scan.next();

        int count = 0;
       for (int i = 0; i < num.length(); i++){
          if (needToFind.equals(num.substring(i, i + needToFind.length()))){
              count++;
          }
       }
        System.out.println(count);
    }

}
