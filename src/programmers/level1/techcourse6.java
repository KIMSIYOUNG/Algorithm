package programmers.level1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class techcourse6 {
    public static String[] solution(int totalTicket, String[] logs) throws ParseException {
        //TODO 티켓 요구사항 : 1) leave 로그가 없다. 2) 본인의 접속시간보다 1분이내로 접속한 사람이 없다. 3) 티켓의 잔여수량이 있어야 한다. 4) 접속시간이 21시-22
        List<String> success = new ArrayList<>();
        Stack<String> result = new Stack<>();
        result.push(logs[0]);
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date now = new Date();

        for(int i=0; i<logs.length; i++){
            String[] split = logs[i].split(" ");
            //TODO 접속시간이 09-10시가 아닌 경우
            Date time = dateFormat.parse(split[2]);
            if(time.getTime()<dateFormat.parse("09:00:00").getTime()
                    ||time.getTime()>dateFormat.parse("10:00:00").getTime())
                break;
            String[] stacksplit = result.peek().split(" ");
            Date stack = dateFormat.parse(stacksplit[2]);
            if(!result.contains(split[0])&&split[1].equals("request")&&totalTicket>=0&&time.getTime()-stack.getTime()<=1000)
                result.push(split[i]);
            }
        String[] answer = new String[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i]=result.get(i).substring(0,5);
        }
        return answer;


    }
    public static void main(String[] args) throws ParseException {
        String[] logs = {"woni request 09:12:29", "brown request 09:23:11"
                , "brown leave 09:23:44", "jason request 09:33:51", "jun request 09:33:56", "cu request 09:34:02"};
        String[] solution = techcourse6.solution(2000, logs);
        System.out.println(Arrays.toString(solution));
        String[] s = logs[1].split(" ");

    }
}
