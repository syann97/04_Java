package ch07.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {

        // Phone이 추상 클래스이기 때문에 직접 인스턴스 생성 불가
        // 상속 클래스 만들기 or 익명 클래스 사용
        Phone phone = new SmartPhone("가나다");

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}