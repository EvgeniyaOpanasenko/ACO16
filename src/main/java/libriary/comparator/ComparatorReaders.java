package libriary.comparator;

import libriary.model.Reader;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Lisa on 11/2/2016.
 */
public class ComparatorReaders  {

    private ArrayList<Reader> readers;
    public Comparator<Reader> sortByNameReader = new Comparator<Reader>() {
        @Override
        public int compare(Reader o1, Reader o2) {
            return 0;
        }
    };


}
