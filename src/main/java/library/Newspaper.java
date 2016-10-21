package library;

public class Newspaper extends PrintedMedia {
	private static int countNumberOfNewspaper = 0;
	
	public Newspaper (){
		
	}
	public Newspaper (String title, String author, int yearOfPublishing, String category){
		super(title, author, yearOfPublishing, category);
		countNumberOfNewspaper++;
		
	}

	/*
	public boolean isAvaliable(Object toFind) {
		if (toFind == null) {
			return false;
		}
		
		for (Object o : listOfMedia )
			if (toFind.equals(o));
		return true;
	}*/

}
