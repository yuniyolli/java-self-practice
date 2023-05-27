package SelfJava.Constructor;

public class KoreanTest {
    public static void main(String[] args) {
        Korean korean = new Korean("yuni", "9384");
        System.out.println("name2: 1" + korean.name);
        System.out.println("ssn1: " + korean.ssn);

        Korean korean1 = new Korean("heasoo", "23345");
        System.out.println("name2: " + korean1.name);
        System.out.println("ssn2: " + korean1.ssn);

    }
}
