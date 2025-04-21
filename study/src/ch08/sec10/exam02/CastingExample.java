package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
//        vehicle.checkFare();  // 해당 부분은 vehicle 인터페이스에 작성되지 않은 메서드이므로 오류 발생

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
