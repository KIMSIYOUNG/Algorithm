package aboutjava.wrapperstudy;

public class WrapperClass {

    public static void main(String[] args) {
        int i = 1;
        Integer i1 = new Integer(5);
        Integer i2 = 3; //오토박싱
        int i3 = i2; //오토 언박싱
        int i4 = i2.intValue();
    }
}
