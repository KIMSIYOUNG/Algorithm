package woowastudy.baseball;

import woowastudy.baseball.controller.BaseballController;

public class Application {
    private static final String SYSTEM_ERROR = "시스템 상의 오류가 있는 것 같습니다. 해결 후 실행해주세요";

    public static void main(String[] args) {
        try {
            BaseballController.play();
        }catch (Exception e){
            System.out.println(SYSTEM_ERROR);
            e.getMessage();
        }
    }

}
