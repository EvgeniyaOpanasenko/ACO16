package libInterface;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;

import library.PrintedMedia;

public interface LibraryInterface {
	/* 1) посмотреть список читателей
      2) посмотреть список доступных конкретных печатных изданий поиск по имени?
      3) добавить печатное издание в библиотеку
      4) добавить читателя в список читателей
      5) выдать печатное издание читателю (если книга есть в наличии).
         Читателю запрещается брать больше 3-х печатных изданий.
      6) посмотреть список печатных изданий, которые находятся у читателей
      7) посмотреть список печатных изданий, которые находятся у конкретного читателя
      8) добавить читателя в черный список (ему нельзя выдавать печатные издания)
      9) посмотреть печатные издания конкретного автора
      10) посмотреть печатные издания конкретного автора
      11) посмотреть печатные издания конкретного года
      12) найти печатное издание по названию (ключевым словам)*/
	
	public String seeAllReaders();
	public Object findAvalibleBooks(PrintedMedia printedMedia);
	public boolean addPrintedMedia(PrintedMedia media);
	public boolean addReder(String name, String secondName, Date dateOfBirth);
	public boolean deleteReder(String name, String secondName, Date dateOfBirth);
	public boolean receiveBookToReader(PrintedMedia printedMedia, Reader reader);
	public boolean giveBookToReader(PrintedMedia printedMedia, Reader reader); // проверить наличине, не более трех книг
	public boolean isAvaliableBook(PrintedMedia printedMedia);
	public boolean notMoreThanThreeBooksInOneHand();
	public String findBookByAuthor(PrintedMedia media, Reader reader);
	public boolean addToBlackList(Reader reder);
	public ArrayList <Object> findBook(PrintedMedia media);
	
	
	
	
	

}
