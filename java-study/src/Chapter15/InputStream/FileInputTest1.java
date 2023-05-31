package Chapter15.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest1 {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try{
           fis = new FileInputStream("input.txt");

           int i = fis.read();
           System.out.println((char) i);
            i = fis.read();
            System.out.println((char) i);
            i = fis.read();
            System.out.println((char) i);
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }

        System.out.println("end");

//        try-with-resource
//        try (FileInputStream fis2 = new FileInputStream("input.txt")){
//            int i;
//            while ((i = fis2.read()) != -1 ){
//                System.out.println((char) i);
//            }
//        } catch (IOException e){
//            e.printStackTrace();
//        }
    }
}
