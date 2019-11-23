package aboutjava.javaIo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * byte 단위 입출력 1byte씩 읽어오는데 이 경우에도 512를 읽어온 후 1바이트를
 * 제외하고 511바이트를 버리는 형태를 반복하는 것. ( 비효율적 )
 */
public class JavaByteTestIo {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        fis = new FileInputStream("src/aboutjava/javaIo/JavaIoTest.java");
        fos = new FileOutputStream("byte2.txt");
        int readData = -1;
        byte[] bytes = new byte[512];

        while((readData = fis.read(bytes))!=-1){
            fos.write(bytes,0,readData);
        }

    }
}
