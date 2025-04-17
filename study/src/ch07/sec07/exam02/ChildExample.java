package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Parent();

        parent.method1();
        parent.method2();

        // Parent 클래스에는 method3이 정의되지 않았기 때문에 에러 발생
        // method3이 정의된 곳은 Child
//        parent.method3();
    }
}
