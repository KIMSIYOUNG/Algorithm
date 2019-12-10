package woowastudy.baseball.view;

public class PrintHandler {
    private static final String FORMAT_ERROR = "올바르지 않은 형식입니다. 다시 입력해주세요";
    private static final String GAME_RULE = "세자리 수를 입력해주세요 ! ";
    private static final String NOTIFY_GAME_END_AND_RESTART = "정답입니다. 게임을 종료하시려면 2번 다시 시작하시려면 1번을 눌러주세요.";
    private static final String NUMBER_ERROR = "잘못된 수를 입력하셨습니다. 다시 입력해주세요.";

    public static void formatError() {
        System.out.println(FORMAT_ERROR);
    }

    public static void printCompareResult(int strike, int ball) {
        StringBuilder sb = new StringBuilder();
        if(strike >0)
            sb.append("STRIKE : " + strike);
        if(ball >0)
            sb.append("BALL" + ball);
        if(strike ==0 && ball ==0)
            sb.append("NOTHING");
        System.out.println(sb.toString());
    }

    public static void notifyGameOver() {
        System.out.println(NOTIFY_GAME_END_AND_RESTART);
    }

    public static void numberError() {
        System.out.println(NUMBER_ERROR);
    }

    public static void notifyGameRule() {
        System.out.println(GAME_RULE);
    }
}
