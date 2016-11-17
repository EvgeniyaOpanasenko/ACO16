package OOP.week6_day1;

import org.hibernate.result.Output;

import java.io.*;

/**
 * Created by Lisa on 11/12/2016.
 */
public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        //InputStream is = null;
       /* try{
             is = new FileInputStream(D:\development\ACO16\src\main\java\OOP\NewFile);
            System.out.println(is.read());
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.err.println("File not find");
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (is != null){
                is.close();
            }
        }*/

        InputStream is = null;
        OutputStream os = null;
       try{
           is = new FileInputStream(new File("D:\\development\\ACO16\\src\\main\\java\\OOP\\NewFile"));
           os = new FileOutputStream( new File ("D:\\development\\ACO16\\src\\main\\java\\OOP\\week6_day1" +
                   "\\copyOfNewFile"));
           int readerBytes;
           byte [] bytes = new byte [1024];

           while ((readerBytes = is.read(bytes)) != -1 ){
               os.write(bytes, 0, readerBytes);
           }

       }catch(FileNotFoundException e){
           e.printStackTrace();
           System.err.println("File not found");
       }finally {
           if (is == null) {
               is.close();
           }
       }{

        }

    }
}
