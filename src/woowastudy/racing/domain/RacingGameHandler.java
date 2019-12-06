package woowastudy.racing.domain;

import woowastudy.racing.view.PrintHandler;
import woowastudy.racing.view.UserInput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RacingGameHandler {

    public static void gameStart() throws IOException {
        UserInput userInput = new UserInput();

        List<Car> userCars = userInput.makeCars();
        int howmany = userInput.howManyPlay();

        for(int i =0; i<howmany; i++){
            for(int k=0; k<userCars.size(); k++){
                userCars.get(k).goForword(checkGoOrStop());
                PrintHandler.printPosition(userCars.get(k));
            }
            PrintHandler.nextLine();
        }
        PrintHandler.printWinner(getWinner(userCars));
    }

    private static List<String> getWinner(List<Car> userCars) {
        int maxPosition = getMaxPosition(userCars);
        List<String> winner = new ArrayList<>();
        for(int i=0;i<userCars.size(); i++){
            if(userCars.get(i).getPosition() == maxPosition){
                winner.add(userCars.get(i).getName());
            }
        }
        return winner;
    }

    private static int getMaxPosition(List<Car> userCars) {
        List<Integer> listForMaxPosition = new ArrayList<>();
        for(int i=0; i<userCars.size(); i++){
            listForMaxPosition.add(userCars.get(i).getPosition());
        }
        return Collections.max(listForMaxPosition);
    }

    private static boolean checkGoOrStop() {
        return (Computer.makeRandomNumber()) >=4;
    }

}
