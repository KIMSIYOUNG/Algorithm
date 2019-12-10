package woowastudy.baseball.controller;

import java.io.IOException;

import woowastudy.baseball.model.GameSimulationModel;
import woowastudy.baseball.model.RandomGenerator;
import woowastudy.baseball.user.UserInput;
import woowastudy.baseball.view.PrintHandler;

public class BaseballController {

    public static void play() throws IOException {
        UserInput userInput = new UserInput();
        GameSimulationModel gameModel = new GameSimulationModel();
        while (true){
            PrintHandler.notifyGameRule();
            int randomNumber = RandomGenerator.makeRandomNumber();
            System.out.println(randomNumber);
            int userNumber = 0;
            do {
                userNumber = userInput.makeNumber();
                gameModel.compareBoth(randomNumber,userNumber);
            }while (!(randomNumber == userNumber));
            if(userInput.wantToStop()){
                break;
            }
        }
    }
}
