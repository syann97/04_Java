package ch06.sec08.exam02;

public class Computer {
//    static int sum (int a, int b, int c) {
//        return a + b + c;
//    }
//
//    static int sum (int a, int b, int c, int d, int e) {
//        return a + b + c + d + e;
//    }
//
//    static int sum (int[] values) {
//        int result = 0;
//        for (int value : values) result += value;
//        return result;
//    }

    int sum(int ... values) {
        //변수 선언
        int sum = 0;

        //values는 배열 타입의 변수처럼 사용
        for (int value : values) sum += value;

        //합산 결과를 리턴
        return sum;
    }
}
