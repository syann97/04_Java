package ch09.sec02.exam02;

public class AExample {
    public static void main(String[] args) {
        // A 객체 생성
        A a = new A();

        // A 인스턴스 메소드 호출
        a.useB();


        /* useB() 메소드 흐름에 따라 설명
        B b = new B();      // "B-생성자 실행" 출력
        System.out.println(b.field1);   // "1" 출력
        b.method1();    // "B-method1 실행" 출력

        System.out.println(B.field2);   // "2" 출력
        B.method2();    // "B-method2" 실행 출력
        */

    }
}
