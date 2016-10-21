package library;

public class Magazine extends PrintedMedia{
	private static int countNumberOfMagazines = 0;
	
	public Magazine(){
		
	}
	
	public Magazine (String title, String author, int yearOfPublishing, String category){
		super(title, author, yearOfPublishing, category);
		countNumberOfMagazines++;
		
	}
	
	}

	