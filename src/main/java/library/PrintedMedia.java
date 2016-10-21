package library;
/*Подумать какие константы можно добавить в вашу
 *  программу "Библиотека", при наличии таких - реализуйте вашу задумку.
    В класс ПереодическоеИздание 
    добавить final метод, который 
    будет возвращать String с базовой информацией об переодическом издании (info()).
    В программе "Библиотека" разширить 
    функционал добавив в классы наследники 
    поле жанр (например в классе "Книга" - 
    детектив, фантастика, роман, проза и т.д.).
     В качестве жанра использовать enum.*/
import java.util.ArrayList;
import java.util.Date;

public abstract class PrintedMedia {
 public static String title;
 public static String author;
 public static int yearOfPublishing;
 public static String category; // жанр
 public static int status;
 
 public ArrayList <PrintedMedia>  listOfMedia;
 
 public PrintedMedia(){
		
	}
 
 public PrintedMedia(String title, String author, int yearOfPublishing, String category ) {
	
 }


}
