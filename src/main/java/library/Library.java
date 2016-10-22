package library
;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import libInterface.LibraryInterface;

public class Library implements LibraryInterface {
	final static int BOOKS_IN_ONE_HANDS = 3;
	List<PrintedMedia> listOfMedia = new ArrayList(); 
	List<Reader> listOfReaders = new ArrayList(); 

	public static int countOfTheSameBook = 0;
	
	public boolean checkIfTheSameBookInLib(PrintedMedia media) {
		for (PrintedMedia m: listOfMedia)
			if (m.equals(media));
		return true;

	}
	@Override
	public String seeAllReaders() {
	
		return null;
	}

	@Override
	public Object findAvalibleBooks(PrintedMedia printedMedia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addPrintedMedia(PrintedMedia media) {
		checkIfTheSameBookInLib(media);
		countOfTheSameBook++;
		listOfMedia.add(media);
		return true;
	}

	@Override
	public boolean addReder(String name, String secondName, Date dateOfBirth) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteReder(String name, String secondName, Date dateOfBirth) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean receiveBookToReader(PrintedMedia printedMedia, Reader reader) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean giveBookToReader(PrintedMedia printedMedia, Reader reader) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAvaliableBook(PrintedMedia printedMedia) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean notMoreThanThreeBooksInOneHand() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String findBookByAuthor(PrintedMedia media, Reader reader) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addToBlackList(Reader reder) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Object> findBook(PrintedMedia media) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
