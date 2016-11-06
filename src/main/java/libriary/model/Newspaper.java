package libriary.model;


import libriary.enums.Genre;

/**
 * Created by Lisa on 11/2/2016.
 */
public class Newspaper extends PrintedMedia {
    public Newspaper(String title, String author, int publishingDate, Genre style) {
        super(title, author, publishingDate, style);
    }
}
