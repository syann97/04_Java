package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car("소나타");
        car.setSpeed(200);

        System.out.println("car.model: " + car.model);
        System.out.println("car.getSpeed(): " + car.getSpeed());

        car.run();
    }
}
