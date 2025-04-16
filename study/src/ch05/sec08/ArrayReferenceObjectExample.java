package ch05.sec08;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {

        // 예상: 첫 번째는 true, 두 번째는 false, 세 번째는 true
        // 이유: 내용 비교할 때는 equals
        // 두 개는 문자열 (String pool)에 존재하고 마지막 문자열은 String 객체로 존재
        // 결과: 예상과 동일
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");
        System.out.println( strArray[0] == strArray[1] );
        System.out.println( strArray[0] == strArray[2] );
        System.out.println( strArray[0].equals(strArray[2]) );
    }
}