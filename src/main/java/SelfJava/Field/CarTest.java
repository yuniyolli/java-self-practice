package SelfJava.Field;

public class CarTest {
    public static void main(String[] args) {
        //creat an object
        Car myCar = new Car();

        //Reading Field Value
        System.out.println("company: " + myCar.company);
        System.out.println("model: " + myCar.model);
        System.out.println("color: " + myCar.color);
        System.out.println("max speed: " + myCar.maxSpeed);
        System.out.println("current speed: " + myCar.speed);

        //Modifying Field Value
        myCar.speed = 60;
        System.out.println("modified speed: " + myCar.speed);
    }
}
