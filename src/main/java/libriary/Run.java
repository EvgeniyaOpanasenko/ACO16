package libriary;

import libriary.controller.Libriary;
import libriary.enums.Genre;
import libriary.model.Boock;
import libriary.model.PrintedMedia;
import libriary.model.Reader;

import java.util.Date;

/**
 * Created by Lisa on 11/1/2016.
 */
public class Run {
    public static void main(String[] args) {
        Libriary lib = new Libriary("MyLib");

        PrintedMedia pr1 = new Boock("Idiot", "Dostoevskiy", 1926, Genre.Comics);

        Reader reader = new Reader("Nastya","Ivanova",34);

        Reader r2 = new Reader("Nastya","Eva",34);
        lib.addReder(r2);

        lib.addReaderToBlackList(reader);


        //System.out.println(lib.seeAllReaders());


    }
}
