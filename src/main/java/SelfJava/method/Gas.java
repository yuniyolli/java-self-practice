package SelfJava.method;

public class Gas {
    //field
    int gas;

    //constructor

    //method
    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas isn't left.");
            return false;
        }
        System.out.println("gas left.");
        return true;

    }

    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("RUN. (gas remain: " + gas + ")");
                gas -= 1;
            } else {
                System.out.printf("STOP. (gas remain: %d ) \n", gas);
                return;
            }
        }
    }
}
