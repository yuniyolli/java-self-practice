package SelfJava.method;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.keyTurnOn();
        myCar.run();
        int speed = myCar.getSpeed();
        System.out.printf("current speed: %d km/h", speed);
    }
}
