package SelfJava.Constructor;

public class Car {
    Car(String color, int cc) {

    }

    String company = "hyundai";
    String model;
    String color;
    int maxSpeed;

    Car(){

    }

    Car(String model) {
        this.model = model;
    }

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
