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
            * String은 짧은 문자열을 더할 경우 사용합니다.
            * StringBuffer는 스레드에 안전한 프로그램이 필요할 때나, 개발 중인 시스템의 부분이 스레드에 안전한지 모를 경우 사용하면 좋습니다.
            * StringBuilder는 스레드에 안전한지 여부가 전혀 관계 없는 프로그램을 개발할 때 사용하면 좋습니다.
         */
        String str = new StringBuffer().append("Hello").append(" ").append("World").toString();
        System.out.println(str);

        String str2 = "";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<100; i++){
            str += "*"; //내부적으로 객체 100개 생성(비효율적)
            sb.append("*"); //하나의 객체에 더해주는 형태 효율적
        }
        System.out.println(str);
        System.out.println(sb.toString());
    }
}
