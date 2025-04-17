package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Computer computer = new Computer();

        System.out.println("Calculator의 areaCircle() : " + calculator.areaCircle(3));
        System.out.println("computer의 areaCircle() : " + computer.areaCircle(3));
    }
}
