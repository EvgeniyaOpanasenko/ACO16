package libriary.comparator;

import libriary.model.PrintedMedia;

import java.util.Comparator;

/**
 * Created by Lisa on 11/2/2016.
 */
public class ComparatorMedia {

    Comparator<PrintedMedia> sortByName = new Comparator<PrintedMedia>() {
        @Override
        public int compare(PrintedMedia o1, PrintedMedia o2) {
            return 0;
        }
    };
}