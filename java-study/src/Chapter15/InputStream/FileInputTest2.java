package Chapter15.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest2 {

    public static void main(String[] args) {



//        try-with-resource
        try (FileInputStream fis = new FileInputStream("input.txt")){
            int i;
            while ((i = fis.read()) != -1 ){
                System.out.println((char) i);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
