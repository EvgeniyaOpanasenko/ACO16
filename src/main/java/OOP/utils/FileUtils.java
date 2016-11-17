package OOP.utils;

import java.io.*;

/**
 * Created by Lisa on 11/12/2016.
 */
public class FileUtils {
    public static void copy(String filePathSrc, String filePathDestination){
        while (fileTypeMissMatch(filePathSrc, filePathDestination));
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(new File (filePathSrc));
            os = new FileOutputStream(new File (filePathDestination));

            int readerBytes;
            byte [] bytes  = new byte[1024];
            while ((readerBytes = is.read(bytes)) != -1){
                os.write(bytes, 0, readerBytes);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static boolean fileTypeMissMatch(String filePathSrc, String filePathDestination) {
        return true;
    }


}
