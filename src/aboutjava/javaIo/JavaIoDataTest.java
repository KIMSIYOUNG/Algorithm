package aboutjava.javaIo;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * DataOutputStream
 */
public class JavaIoDataTest {

    public static void main(String[] args) throws IOException {

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"))){
            dos.writeChar('A');
            dos.writeInt(4);
            dos.writeBoolean(true);
            dos.writeDouble(1.5);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
