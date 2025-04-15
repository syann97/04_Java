package ch03.sec11;


public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );

        // 삼항 연산자로 85점은 90점 미만 80점 초과이기 때문에 B 등급 출력
        System.out.println(score + "점은" + grade + "등급입니다.");
    }
}
