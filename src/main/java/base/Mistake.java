package main.java.base;

import java.util.Scanner;

/**
 * Created by Lisa on 10/31/2016.
 * 7) Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
 времени года. Если пользователь введет недопустимое число, программа
 должна выдать сообщение об ошибке.
 */
public class Mistake {
    public static void main(String[] args) {
        for (int i = 1; i < 13; i ++){
            //System.out.println(i);
        }
        String monthString;
        Scanner scanner = new Scanner(System.in);
        int month  = scanner.nextInt();
        switch(month ){
            case 1:
                System.out.println( "Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Не знаем такого");
                break;
        }
    }
}
