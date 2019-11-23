package aboutjava.javaIo;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * DataInputStream
 */
public class JavaDataInputTest {

    public static void main(String[] args) {
        try(DataInputStream in = new DataInputStream(new FileInputStream("byte.txt"))){
            int i = in.readInt();
            char c = in.readChar();
            System.out.println(i);
            System.out.println(c);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
