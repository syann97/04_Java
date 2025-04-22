package ch09.sec05.exam02;

public class AExample {
    public static void main(String[] args) {
        // A 객체 생성
        A a = new A();

        // A 메소드 호출
        a.useB();

        /*
        B-field, B-method 출력 => 내부 클래스의 this 호출
        이후 A-field, A-method 출력 => 외추 클래스의 this 호출
        */
    }
}
