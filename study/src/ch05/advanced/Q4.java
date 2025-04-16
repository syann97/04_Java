package ch05.advanced;

public class Q4 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {73, 83, 93, 87, 88}
        };

        System.out.println(array.length); // 행이 3개이기 때문에 3
        System.out.println(array[2].length); // 2행에는 5개의 열이 있기 때문에 5
    }
}
