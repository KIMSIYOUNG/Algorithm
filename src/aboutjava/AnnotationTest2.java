package aboutjava;

import java.lang.reflect.Method;

public class AnnotationTest2 {

    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationTest annotationTest = new AnnotationTest();
        Method hello = annotationTest.getClass().getDeclaredMethod("hello");
        if(hello.isAnnotationPresent(Count100.class)){
            System.out.println("true");
            for(int i=0; i<100; i++)
                annotationTest.hello();
        }else{
            System.out.println("fuck");
        }
    }

}
