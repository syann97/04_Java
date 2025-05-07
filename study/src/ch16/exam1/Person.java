package ch16.exam1;

public class Person {
    // 매개변수로 workable 인터페이스를 구현한 객체를 전달 받음
    public void action(workable workable) {
        workable.work();
    }
}
