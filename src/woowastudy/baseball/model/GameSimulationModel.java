package woowastudy.baseball.model;

import java.util.Arrays;
import java.util.List;

import woowastudy.baseball.view.PrintHandler;

public class GameSimulationModel {
    private static final int ZERO = 0;
    private static final String BLANK = "";

    public void compareBoth(int randomNumber, int userNumber) {
        int strike = 0;
        int ball = 0;
        String[] userArray = makeNumberToArray(userNumber);
        List<String> randomList = makeNumberToList(randomNumber);
        for(int i=0; i<randomList.size(); i++){
            if(randomList.get(i).equals(userArray[i])){
                strike++;
            } else if(randomList.contains(userArray[i])){
                ball++;
            }
        }
        PrintHandler.printCompareResult(strike,ball);
    }

    private List<String> makeNumberToList(int userNumber) {
        return Arrays.asList(String.valueOf(userNumber).split(""));
    }

    private String[] makeNumberToArray(int randomNumber) {
        return String.valueOf(randomNumber).split(BLANK);
    }
}
