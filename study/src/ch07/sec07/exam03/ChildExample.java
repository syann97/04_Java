package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {

        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();


        // 불가능 -> 참조하는 것은 Parent이기 때문에
        // Parent에 정의되어있지 않은 변수나 메서드는 사용 불가
        
//        parent.field2 = "data2";
//        parent.method3();

        Child child = (Child) parent;

        child.field2 = "data2";
        child.method3();
    }
}
