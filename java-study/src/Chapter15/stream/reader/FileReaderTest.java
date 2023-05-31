package Chapter15.stream.reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("reader.txt"); // 바이트 단위로 읽음(socket)
        InputStreamReader isr = new InputStreamReader(fis); // 문자 단위로 다시 읽 보조 스트림
        int i = 0;
        while ((i=isr.read())!= -1){
            System.out.print((char) i);
        }

        isr.close();
    }
}
