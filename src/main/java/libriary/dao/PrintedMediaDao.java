package libriary.dao;

import libriary.controller.Libriary;
import libriary.database.LibriaryDataBase;
import libriary.model.PrintedMedia;
import libriary.model.Reader;

import java.util.List;

/**
 * Created by Lisa on 11/2/2016.
 */
public class PrintedMediaDao {
    List<PrintedMediaDao> medias;
    private LibriaryDataBase libdb;

    public PrintedMediaDao(){

        libdb = LibriaryDataBase.getInstance();
    }
    public boolean findPrintedMedia(PrintedMedia printedMedia){

        return libdb.findPrintedMedia(printedMedia);
    }

    public PrintedMedia getPrintedMedia(PrintedMedia printedMedia){

        return libdb.getPrintedMedia(printedMedia);
    }
}
