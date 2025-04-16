package ch04.sec03;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {

        // 예상: break가 없기 때문에 9번 이후의 case들을 전부 출력
        // 결과: 동일
        int time = 9;
        System.out.println("[현재시간: " + time + "시]");

        switch(time) {
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            default:
                System.out.println("외근을 나갑니다.");
        }
    }
}
