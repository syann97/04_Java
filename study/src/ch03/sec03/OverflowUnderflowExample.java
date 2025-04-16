package ch03.sec03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        byte var1 = 125;
        for (int i = 0; i < 5; i ++) {
            var1++;

            // byte는 127~-128까지 표현 가능
            // 127에서 값을 증가시키는 overflow가 발생해 가장 낮은 -128로 전환
            // 맨 앞 비트는 부호 비트
            System.out.println("var1: " + var1);
        }

        System.out.println("-------------------------");

        byte var2 = -125;
        for (int i = 0; i < 5; i++) {
            var2--;

            // byte는 127~-128까지 표현 가능
            // -128에서 감소시키는 경우 underflow 발생 => 127이 됩니다.
            System.out.println("var2: " + var2);
        }
    }
}
