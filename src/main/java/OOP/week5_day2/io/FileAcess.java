package OOP.week5_day2.io;

import java.io.File;
import java.io.IOException;

/**
 * Created by Lisa on 11/6/2016.
 */
public class FileAcess {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\week4_day1\\src\\OOP\\week5_day2\\io\\myText.txt");
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
       // System.out.println(file.delete());
       File newFile = new File("D:\\week4_day1\\src\\OOP\\week5_day2\\io\\dir3\\name.txt");
        System.out.println(newFile.isDirectory());
        newFile.createNewFile();
        System.out.println(newFile.isFile());

        File newDir = new File("D:\\week4_day1\\src\\OOP\\week5_day2\\io\\dir3\\innerDir");
        System.out.println(newDir.mkdir());
        newDir.renameTo(new File("D:\\week4_day1\\src\\OOP\\week5_day2\\io\\dir3\\renamedDir"));

    }
}
