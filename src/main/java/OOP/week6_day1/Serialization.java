package OOP.week6_day1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Created by Lisa on 11/12/2016.
 */
public class Serialization {
    public static void main(String[] args) {
        try(OutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\development\\ACO16\\src\\main\\java\\OOP\\University"))) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
