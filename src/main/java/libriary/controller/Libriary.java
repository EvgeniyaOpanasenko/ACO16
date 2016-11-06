package libriary.controller;

import libriary.dao.PrintedMediaDao;
import libriary.dao.ReaderDao;
import libriary.database.LibriaryDataBase;
import libriary.model.PrintedMedia;
import libriary.model.Reader;
import libriary.comparator.ComparatorReaders;

import java.util.ArrayList;

/**
 * Created by Lisa on 11/4/2016.
 */
public class Libriary {

    private String name;
    private ArrayList<Reader> readers;
    private ArrayList<PrintedMedia> medias;
    private ReaderDao readerDao;
    private PrintedMediaDao mediaDao;

    public Libriary(String name) {
        readers = new ArrayList<>();
        medias = new ArrayList<>();
        this.name = name;
        readerDao = new ReaderDao();
        mediaDao = new PrintedMediaDao();
    }

    public ArrayList<Reader> showReaders(){
        //sortByNameReader();
        return readers;
    }

    public boolean addReder(Reader r) {
        return readerDao.addReader(r);
    }

    public boolean deleteReder(Reader r) {
        return readerDao.deleteRaeder(r);
    }

    public boolean addReaderToBlackList(Reader r) {
        return readerDao.addReaderToBblaclList(r);
    }

    public boolean deleteReaderFromBlackList(Reader r) {
        return readerDao.deleteRaederFromBlackList(r);
    }

    public boolean giveBoocktoReader(Reader r, PrintedMedia m){ // проверка на //// количество книг в одни руки
        if (! readerDao.findReader(r)) return false;
        if (! mediaDao.findPrintedMedia(m)) return false;
        Reader reader = readerDao.getReader(r);
        return reader.addPrintedMedia(mediaDao.getPrintedMedia(m));


    }

    public boolean addPrintedMedia(PrintedMedia p) {
        return false;
    }


    public PrintedMedia getPrintedMedia(PrintedMedia p) {
        return p;
    }

    public Reader getReader(Reader r) {
        return r;
    }
    public boolean deletePrintedMedia(PrintedMedia p) {
        return false;
    }

    public boolean findPrintedMedia(PrintedMedia p) {
        return false;
    }

    public boolean findReader(Reader r) {
        return false;
    }


}