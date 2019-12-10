package woowastudy.baseball.user;

import java.util.HashSet;
import java.util.Set;

import woowastudy.baseball.view.PrintHandler;

public class InputValidator {
    private static final int MAX_RANGE = 999;
    private static final int MIN_RANGE = 100;
    private static final String BLANK = "";
    private static final int DIGIT_COUNT = 3;


    public static boolean checkNumberOk(int userInput) {
        if (numberRangeOk(userInput) && checkDigitNumberOK(userInput)) {
            return true;
        }
        return false;
    }

    private static boolean checkDigitNumberOK(int userInput) {
        Set<Integer> setForCheckDigitNumbers = new HashSet<>();
        String[] userInputArray = String.valueOf(userInput).split(BLANK);
        for (int i = 0; i < userInputArray.length; i++) {
            setForCheckDigitNumbers.add(Integer.valueOf(userInputArray[i]));
        }
        if (setForCheckDigitNumbers.size() == DIGIT_COUNT) {
            return true;
        }
        return false;
    }

    private static boolean numberRangeOk(int userInput) {
        if (userInput >= MIN_RANGE && userInput <= MAX_RANGE) {
            return true;
        }
        return false;
    }

    public static boolean checkEndingNumberOk(int userInput) {
        if(userInput == 1 || userInput ==2)
            return true;
        PrintHandler.numberError();
        return false;
    }
}
