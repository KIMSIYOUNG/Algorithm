package woowastudy.racing.view;

import woowastudy.racing.domain.Car;

import java.util.List;

public class PrintHandler {
    private static final String carNameRule = "자동차 이름을 ,를 기준으로 입력해주세요";
    private static final String BLANK = "";
    private static final String howManyRule = "몇번을 수행하시겠습니까? 1이상의 자연수로 입력해주세요.";
    private static final String formatError = "입력이 잘못되었습니다. 다시 입력해주세요";

    public static void notifyRuleOfMakingCar() {
        System.out.println(carNameRule);
    }

    public static void notifyRuleOfHowMany() {
        System.out.println(howManyRule);
    }

    public static void printFormatError() {
        System.out.println(formatError);
    }

    public static void nextLine() {
        System.out.println(BLANK);
    }

    public static void printPosition(Car car) {
        System.out.print(car.getName() + " : ");
        for(int i=0; i<car.getPosition(); i++){
            System.out.print("-");
        }
        System.out.println("");
    }

    public static void printWinner(List<String> winner) {
        System.out.print("최종 우승자는 : ");
        for(int i=0;i<winner.size(); i++){
            System.out.print(winner.get(i));
            if(i!=(winner.size()-1))
                System.out.print(",");
        }
        System.out.print(" 입니다.");
    }
}
