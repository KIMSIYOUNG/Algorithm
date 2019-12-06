package woowastudy.racing.view;

import woowastudy.racing.domain.Car;
import woowastudy.racing.view.PrintHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UserInput {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final String COMMA = ",";
    private static final int ZERO = 0;


    public List<Car> makeCars() throws IOException {
        PrintHandler.notifyRuleOfMakingCar();
        String[] userArray = br.readLine().trim().split(COMMA);
        return arrayToList(userArray);
    }

    private List<Car> arrayToList(String[] userArray) {
        List<Car> userList = new ArrayList<>();
        for (int i = 0; i < userArray.length; i++) {
            userList.add(new Car(userArray[i]));
        }
        return userList;
    }

    public int howManyPlay() throws IOException {
        PrintHandler.notifyRuleOfHowMany();
        int howMany = ZERO;
        try {
             howMany = Integer.parseInt(br.readLine().trim());
        }catch (NumberFormatException e){
            PrintHandler.printFormatError();
            howManyPlay();
        }
        return howMany;
    }
}
