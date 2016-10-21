package library;

import java.util.ArrayList;

public class Book extends PrintedMedia{
	private static int countNumberOfBooks = 0;// счетчик всего книг
	
	public Book(){
		
	}
	
	public Book (PrintedMedia book, String category){
		super(title, author, yearOfPublishing, category);
		countNumberOfBooks++;
		
	}

}
