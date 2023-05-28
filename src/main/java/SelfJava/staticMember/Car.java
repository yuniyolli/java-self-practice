package SelfJava.staticMember;

public class Car {
    int speed;

    void run() {
        System.out.println("running with the speed of " + speed);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.speed = 60;
        myCar.run();
    }
}
