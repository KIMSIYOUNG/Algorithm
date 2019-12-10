package woowastudy.baseball.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RandomGenerator {
    private static final int DIGIT_NUMBER = 3;
    private static final String BLANK = "";

    public static int makeRandomNumber(){
        Set<Integer> setForRandom = new HashSet<>();
        while(!(setForRandom.size() == DIGIT_NUMBER)){
            setForRandom.add((int)(Math.random()*9+1));
        }
        return setToNumber(setForRandom);
    }

    private static int setToNumber(Set<Integer> setForRandom) {
        Iterator<Integer> setIterator= setForRandom.iterator();
        String result = BLANK;
        while(setIterator.hasNext()){
            result += String.valueOf(setIterator.next());
        }
        return Integer.parseInt(result);
    }

}
