package ch02.sec08;

public class StringConcatExample {
    public static void main(String[] args) {
        // 모두 더한 값이 문자열로 변환
        int result1 = 10 + 2 + 8;
        System.out.println("result1: " + result1);

        // 10과 2를 더한 12 뒤에 8이 붙은 문자열
        String result2 = 10 + 2 + "8";
        System.out.println("result2: " + result2);

        // 10 가운데 2 끝에 8이 붙은 문자열
        String result3 = 10 + "2" + 8;
        System.out.println("result3: " + result3);

        // 10이라는 문자열이 앞에 나와 뒤에있는 숫자들은 문자열이 됨
        String result4 = "10" + 2 + 8;
        System.out.println("result4: " + result4);

        // 10 그리고 10이 연산된 문자열
        String result5 = "10" + (2 + 8);
        System.out.println("result5: " + result5);


    }
}
