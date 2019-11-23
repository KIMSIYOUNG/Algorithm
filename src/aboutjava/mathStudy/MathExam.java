package aboutjava.mathStudy;

/**
 * 모든 클래스의 메소드가 Static으로 선언되었기 때문에, 그냥 사용하면 된다.
 */
public class MathExam {

    public static void main(String[] args) {
        System.out.println(Math.abs(-10));
        System.out.println((int)(Math.random()*10));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.pow(5,2));
        System.out.println(Math.nextUp(3.0));
        System.out.println(Math.log(2));
    }
}
