package libriary.dao;

import libriary.database.LibriaryDataBase;
import libriary.model.Reader;

import java.util.List;

/**
 * Created by Lisa on 11/1/2016.
 */
public class ReaderDao {
    private LibriaryDataBase libDB;
    List<Reader> readers;

    public ReaderDao(){

        libDB = LibriaryDataBase.getInstance();
    }

    public boolean findReader(Reader reader){

        return libDB.findReader(reader);
    }

    public Reader getReader(Reader reader){
        return libDB.getReader(reader);
    }

    public boolean addReaderToBblaclList(Reader r) {
        return libDB.addReader(r);
    }

    public boolean addReader(Reader r) {
        return libDB.addReader(r);
    }

    public boolean deleteRaeder(Reader r) {
        return libDB.deleteReader(r);
    }

    public boolean deleteRaederFromBlackList(Reader r) {
        return libDB.deleteReaderFromBlackList(r);
    }
}
