package aboutjava.objectstudy;

public class Car {

    String name;
    int number;

    @Override
    public String toString() {
        return "name: " + name +
                ", number: " + number;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Benz";
        car.number = 9442;
        System.out.println(car);

    }
}
