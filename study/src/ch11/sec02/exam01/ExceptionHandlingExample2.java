package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수: " + result);

            // NullPointerException 처리
            // e.getMessage()로 메시지 출력
            // e.printStackTrace()로 스택 추적 내용 모두 출력
        } catch(NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        } finally {
            System.out.println("[마무리 실행]\n");
        }
    }

    /* 문제는 printLength의 파라미터는 String 타입이지만
     *  null을 입력하게 되어 NullPointerException이 발생 */
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}
