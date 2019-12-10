package woowastudy.baseball.user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import woowastudy.baseball.view.PrintHandler;

public class UserInput {
    private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

    public int makeNumber() throws IOException {
        int userInput = makeRawNumber();
        if(InputValidator.checkNumberOk(userInput))
            return userInput;
        PrintHandler.numberError();
        return makeNumber();
    }

    private int makeRawNumber() throws IOException {
        try {
            return Integer.parseInt(BR.readLine().trim());
        }catch (NumberFormatException e){
            PrintHandler.formatError();
            return makeRawNumber();
        }
    }

    public boolean wantToStop() throws IOException {
        PrintHandler.notifyGameOver();
        int userInput = makeRawNumber();
        if(!InputValidator.checkEndingNumberOk(userInput))
            return wantToStop();
        if(userInput ==2)
            return true;
        return false;
    }
}
