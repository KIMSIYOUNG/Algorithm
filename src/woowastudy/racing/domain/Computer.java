package woowastudy.racing.domain;

public class Computer {
    private static final int RANGE = 9;

    public static int makeRandomNumber(){
        return (int)(Math.random() * RANGE);
    }
}
