package aboutjava.stringbuffer;

/**
 * String VS StringBuffer
 * 메모리상의 효율성 또한 Buffer가 높지만 시간으로 비교해도 StringBuffer가 훨씬 효율적
 * 참고로 StringBuilder가 조금 더 시간효율적이라고 함.(Thread-safe한 환경에선 StringBuilder의 사용이 Best)
 * 10만이 넘어가는 경우 String은 거의 사용 불가.
 */

public class StringBufferPerformTest {
        public static void main(String[] args){
            // (1) String의 +연산을 이용해서 10,000개의 *를 이어붙입니다.
            //시작시간을 기록합니다.(millisecond단위)
            long startTime1 = System.currentTimeMillis();
            String str="";
            for(int i=0;i<100000;i++){
                str=str+"*";
            }
            //종료시간을 기록합니다.(millisecond단위)
            long endTime1 = System.currentTimeMillis();

            // (2) StringBuffer를 이용해서 10,000개의 *를 이어붙입니다.
            //시작시간을 기록합니다.(millisecond단위)
            long startTime2 = System.currentTimeMillis();
            StringBuffer sb = new StringBuffer();
            for(int i=0;i<100000;i++){
                sb.append("*");
            }
            //종료시간을 기록합니다.(millisecond단위)
            long endTime2 = System.currentTimeMillis();

            // 방법(1)과 방법(2)가 걸린 시간을 비교합니다.
            long duration1 = endTime1-startTime1;
            long duration2 = endTime2-startTime2;

            System.out.println("String의 +연산을 이용한 경우 : "+ duration1);
            System.out.println("StringBuffer의 append()을 이용한 경우 : "+ duration2);
        }
}

