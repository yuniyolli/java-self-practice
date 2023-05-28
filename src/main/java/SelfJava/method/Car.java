package SelfJava.method;

public class Car {
    //field
    int speed;

    //constructor

    //method
    int getSpeed() {
        return speed;
    }

    void keyTurnOn() {
        System.out.println("trun key");
    }

    void run() {
        for (int i = 10; i <= 50; i+=10) {
            speed = i;
            System.out.println("run. (Speed: " + speed + "km/h)");

        }
    }
}
