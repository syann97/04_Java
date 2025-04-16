package ch03.sec07;

public class LogicalOperatorExample {
    public static void main(String[] args) {

        // 문자열의 code에 따라 char가 int로 변환될 때 code 숫자로 변환
        // 즉 변환되는 값이 정해져있고 그 값에 따라 출력이 달라집니다.
        int charCode = 'A';
        // int charCode = 'a';
        // int charCode = '5';

        if ((65 <= charCode) & (charCode <= 90)) {
            System.out.println("대문자이군요");
        }

        if ((97 <= charCode) && (charCode <= 122)) {
            System.out.println("소문자이군요");
        }

        if ((48 <= charCode) && (charCode <= 57)) {
            System.out.println("0~9 숫자이군요.");
        }
        // ---------------------------------------------

        // 2 또는 3의 배수인지 아닌지 여부에 따라 출력이 바뀌는 로직
//        int value = 6;
        int value = 7;

        if ((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수이군요.");
        }

        boolean result = (value % 2 == 0) || (value % 3 == 0);
        if (!result) {
            System.out.println("2 또는 3의 배수가 아니군요");
        }
    }
}
