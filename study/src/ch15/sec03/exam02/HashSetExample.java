package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 컬렉션 생성
        Set<Member> set = new HashSet<Member>();

        // Member 객체 저장
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));

        // 저장된 객체 수 출력
        /* Member 클래스에 hashCode와 equals를 Overriding 했기 때문에
            생성자로 객체를 생성할 때 파라미터가 동일하다면 동일한 객체로 간주,
            그러므로 set에서 중복 제거를 통해 1을 출력
        * */
        System.out.println("총 객체 수: " + set.size());
    }
}
