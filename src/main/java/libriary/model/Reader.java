package libriary.model;

import java.util.List;

/**
 * Created by Lisa on 11/1/2016.
 */
public class Reader {
    private String name;
    private String surname;
    private int dateOfBirth;
    private List<PrintedMedia> listOfTakenBoocks;
    private final static int NUMBER_BOOCK_FOR_ONE_READER = 3;

    public Reader (String name, String surname, int dateOfBirth){
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }


    public boolean checkForBlackList() { // про цей метод питання
        return false;
    }

    public boolean addPrintedMedia(PrintedMedia m) {
        return false;
    }
}
