package ch03.sec06;

public class CompareOperatorExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);

        // num1과 num2는 같은 수이기 때문에 result2만 false
        // 나머지 true
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);


        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2); //65 < 66
        // 문자를 비교할 때 code 번호로 비교하기 때문에 char1 < char2는 true
        // result4 는 true 출력
        System.out.println("result4: " + result4);



        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4);
        // 타입이 달라도 같은 숫자이기 때문에  true 출력
        System.out.println("result5: " + result5);


        float num5 = 0.1f;
        double num6 = 0.1;
        boolean result6 = (num5 == num6);
        boolean result7 = (num5 == (float)num6);

        // float과 double을 비교할 때 같은 숫자이더라도 false 출력
        // true를 출력하기 위해서는 둘 중 하나의 타입으로 변환해야 함
        System.out.println("result6: " + result6);
        System.out.println("result7: " + result7);


        // 문자열 비교 연산 수행
        // result8은 srt1과 str2가 서로 다른 문자열이기 떄문에 false
        // result9는 true를 출력
        String str1 = "자바";
        String str2 = "Java";
        boolean result8 = (str1.equals(str2));
        boolean result9 = (! str1.equals(str2));
        System.out.println("result8: " + result8);
        System.out.println("result9: " + result9);
    }
}