package SelfJava;

public class DoubleForExam05 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int sum = 0;
        double avg = 0.0;
        int devide = 0;
        //행을 반복하는 j : j는 0~2까지 있음
        for (int j = 0; j < array.length; j++) {
            //열을 반복하는 i. (j, i) 의 형태. 즉 길이는 각 행인 J를 반복하여 출력하는 것
            for (int i = 0; i < array[j].length; i++) {
                sum += array[j][i];
                devide++;
            }
        }
      avg = (double) sum / devide;

            System.out.println("sum: " + sum);
            System.out.println("ave: " + avg);
        }
    }

