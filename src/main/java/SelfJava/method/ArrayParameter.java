package SelfJava.method;

public class ArrayParameter {
    //메소드 파라메터에 길이가 정해지지 않은 배열 선언하기
    int sum1(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    // ...을 사용하여 호출시 파라메터에 배열 값 바로 집어넣기
    int sum2(int... values) {
        int sum = 0;
        for (int i = 0; i < values.length ; i++) {
            sum += values[i];
        }
        return sum;
    }
}
//sum1, sum2 실행문 완전 일치하!!!!