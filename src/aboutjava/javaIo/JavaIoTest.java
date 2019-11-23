package aboutjava.javaIo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * byte 단위 입출력 512byte씩 읽어와서 출력하기
 */
public class JavaIoTest {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        fis = new FileInputStream("src/aboutjava/javaIo/JavaIoTest.java");
        fos = new FileOutputStream("byte.txt");
        int readData = -1;
        while((readData= fis.read())!=-1){
            fos.write(readData);
        }

    }
}
