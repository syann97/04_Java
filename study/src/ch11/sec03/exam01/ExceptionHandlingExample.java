package ch11.sec03.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            String[] array = {"100", "1oo"};
            for(int i=0; i<=array.length; i++) {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i+ "]: " + value);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스가 초과됨:" + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("문자열을 숫자로 바꿀 수 없음: " + e.getMessage());
        }
    }
}
