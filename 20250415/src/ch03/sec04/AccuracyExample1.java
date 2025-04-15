package ch03.sec04;

public class AccuracyExample1 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        // 1 - 0.7이기 떄문에 0.3이 정답일 것이라고 생각하지만
        // 컴퓨터에서 소수점은 부동소수점이기 때문에
        // 정확하지 않고 근사한 값을 표시합니다.
        double result = apple - number * pieceUnit;
        System.out.println("사과 1개에서 남은 양: " + result);
    }
}
