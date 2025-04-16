package ch05.sec06;

import java.util.Arrays;

public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] arr = {84, 90, 96};
        int sum = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }

        System.out.println("총합: " + sum);
        System.out.println("평균: " + sum/length);
    }
}
