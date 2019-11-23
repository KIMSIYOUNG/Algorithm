package aboutjava.stringbuffer;

public class StringBufferExam {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World");

        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer stringBuffer2 = stringBuffer1.append("Hello");

        System.out.println(stringBuffer1.equals(stringBuffer2));

        /**
         * 스트링과 다르게, 스프링버퍼는 본인이 변화한다. (스트링은 다른 참조값을 같도록 설정되지만 스프링 버퍼는 자신의 값이 변화함)
         * Method Chaining : 메소드 실행결과 반환타입을 자기자신으로 함으로써 메소드를 체인형태로 계속 사용할 수 있게 하는 것을 의미함.
         * String Class VS StringBuffer VS StringBuilder
         */
        String str = new StringBuffer().append("Hello").append(" ").append("World").toString();
        System.out.println(str);

    }
}
