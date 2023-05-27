package SelfJava.method;

public class GasTest {
    public static void main(String[] args) {
        Gas myCar = new Gas();

        myCar.setGas(5);

        boolean gasState = myCar.isLeftGas(); //boolean to print out 'gas remain or not'
        if (gasState) {
            System.out.println("START");
            myCar.run();
        }

        if(myCar.isLeftGas()) {
            System.out.println("No additional gas needed.");
        } else {
            System.out.println("More gas needed.");
        }
    }
}
