
package base;

import java.util.Scanner;

/**
 * Created by Lisa on 10/31/2016.
 * Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
 лить, является ли он прямоугольным. Ответ вывести в виде сообщения.
 */
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("first side");
        double a = scanner.nextInt();
        System.out.println("second side");
        double b = scanner.nextInt();
        System.out.println("third side");
        double c = scanner.nextInt();

        if ((Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2) || (Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2 ))
        || (Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2)))){
            System.out.println("Pifagorov");
        }else {
            System.out.println("not ");
        }

    }
}
