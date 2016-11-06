package libriary.model;

import libriary.enums.Genre;


/**
 * Created by Lisa on 11/1/2016.
 */
public class Boock extends PrintedMedia {


    public Boock(String title, String author, int publishingDate, Genre style) {
        super(title, author, publishingDate, style);
    }
}
