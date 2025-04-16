package ch03.sec04;

public class AccuracyExample2 {
    public static void main(String[] args) {
        int apple = 1;
        int totalPieces = apple * 10;
        int number = 7;
        int result = totalPieces - number;

        // 0.3은 2진법으로 근사 가능한 값 중 비교적 안정적인 수라서
        // 출력 시에도 오차 없이 깔끔하게 출력됨.
        System.out.println("10조각에서 남은 조각: " + result);
        System.out.println("사과1개에서 남은 양: " + result/10.0);
    }
}