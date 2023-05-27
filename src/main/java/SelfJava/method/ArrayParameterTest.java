package SelfJava.method;

public class ArrayParameterTest {
    public static void main(String[] args) {
        ArrayParameter myArr = new ArrayParameter();

        int[] values1 = {1, 2, 3};
        int result1 = myArr.sum1(values1);
        System.out.println("result1: " + result1);

        int result2 = myArr.sum1(new int[]{1, 2, 3, 4, 5});
        System.out.println("result2: " + result2);

        int result3 = myArr.sum2(1, 2, 3);
        System.out.println("result3: " + result3);

        int result4 = myArr.sum2(1, 2, 3, 4, 5);
        System.out.println("result4: " + result4);
    }
}
