package ch03.sec10;

public class AssignmentOperatorExample {
    public static void main(String[] args) {
        int result = 0;
        result += 10;
        System.out.println("result=" + result); // 10 출력

        result -= 5;
        System.out.println("result=" + result); // 5 출력

        result *= 3;
        System.out.println("result=" + result); // 15 출력

        result /= 5;
        System.out.println("result=" + result); // 3 출력

        result %= 3;
        System.out.println("result=" + result); // 0 출력
    }
}