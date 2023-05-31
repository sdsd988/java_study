package Chapter15.InputStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {
    public static void main(String[] args) {

        System.out.println("입력 후 '끝' 이라고 쓰세요 : ");

        try {
            int i;
            InputStreamReader isr = new InputStreamReader(System.in); //바이트로 입력된 값을 문자로
            while ((i = isr.read()) != '끝'){
                System.out.print((char) i);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
