package woowastudy.racing.domain;

public class Car {
    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void goForword(boolean b){
        if(b)
            position++;
    }
}
