package org.scoula.lib;

public class InputTest {
    public static void main(String[] args) {
        Input obj = new Input();
        System.out.println("입력값: " + obj.read("이름: "));
        System.out.println("입력값: " + obj.read("이름(홍길동): ", "홍길동"));
        System.out.println("입력값: " + obj.readInt("나이: "));
        System.out.println("입력값: " + obj.confirm("종료할까요? "));
        System.out.println("입력값: " + obj.confirm("종료할까요? ", true));


    }
}
