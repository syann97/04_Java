package ch05.advanced;

public class Q6 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {73, 83, 93, 87, 88}
        };

        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            count += array[i].length;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        System.out.println("총합: " + sum);
        System.out.println("평균: " + (double)sum/count);
    }
}
