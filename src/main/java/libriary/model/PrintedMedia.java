package libriary.model;

import libriary.enums.Genre;


/**
 * Created by Lisa on 11/1/2016.
 */
public abstract class PrintedMedia {
    private String title;
    private String author;
    private String shortDescriprion;
    private int publishingDate;
    private Genre style;

    //private boolean status; // is in use

    public PrintedMedia (String title, String author,
                         int publishingDate, Genre style){
        this.title = title;
        this.author = author;
        this.publishingDate = publishingDate;
        this.style = style;

    }


}
