package aboutjava.stringbuffer;

import java.util.Random;

public class StringBufferExam2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        String[] firstNames = {"Tod", "John", "Michael"};
        String[] lastNames = {"Smith", "Brown", "Davis"};

        int i = new Random().nextInt(3);
        String firstName = firstNames[i];
        int i1 = new Random().nextInt(3);
        String lastName = lastNames[i1];

        System.out.println(sb.append(firstName).append(" ").append(lastName).toString());
    }
}
