package libriary.database;

import libriary.model.PrintedMedia;
import libriary.model.Reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Lisa on 11/1/2016.
 */
public class LibriaryDataBase {
    private static List<PrintedMedia> medias;
    private static List<Reader> readers;
    private static List<Reader> blackList;

    private static LibriaryDataBase libDBInstance;

    public static LibriaryDataBase getInstance(){
        if (libDBInstance == null){
            synchronized (LibriaryDataBase.class){
                if (libDBInstance == null){
                    libDBInstance = new LibriaryDataBase();
                }
            }
        }
        return libDBInstance;
    }

    public LibriaryDataBase(){}
    private static LibriaryDataBase libDb = new LibriaryDataBase();

    public static LibriaryDataBase getInstatnce(){
        return libDb;
    }

    public boolean checkForBlackList(Reader reader) {
        return findReader(reader);
    }

    public boolean addReader(Reader reader){
        if (reader == null || readers.contains(reader)
                || reader.checkForBlackList()) return false;// почему не видит метод
        // и настоятельно рекомендует его созавать в РИДЕРЕ??
        return readers.add(reader);
    }

    public boolean addIssue(PrintedMedia issue){
        if (issue == null) return false;
        return medias.add(issue);
    }

    public boolean deleteReader(Reader reader){
        if (reader == null) return false;

        return false;
    }

    public Reader getReader(Reader reader) {
        return reader;
    }

    public boolean findReader(Reader reader) {
        return false;
    }

    public boolean deleteIssue(PrintedMedia issue){
        return false;
    }

    public boolean addReaderToBblaclList(Reader r) {
        return false;
    }

    public boolean addReder(Reader r) {
        return libDb.addReader(r);
    }

    public boolean deleteReder(Reader r) {
        return libDb.addReader(r);
    }

    public boolean addReaderToBlackList(Reader r) {
        return libDb.addReaderToBblaclList(r);
    }

    public boolean deleteReaderFromBlackList(Reader r) {
        return libDb.addReaderToBblaclList(r);
    }

    public boolean addPrintedMedia(PrintedMedia p) {
        return false;
    }


    public PrintedMedia getPrintedMedia(PrintedMedia p) {
        return p;
    }

    public boolean deletePrintedMedia(PrintedMedia p) {
        return false;
    }

    public boolean findPrintedMedia(PrintedMedia p) {
        return false;
    }

}
