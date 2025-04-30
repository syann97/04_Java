package ch15.sec03.exam01;
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        /** set은 중복 저장을 허용하지 않기 떄문에
         * 5개의 항목 중에서 중복되는 "Java"를 제거해
         * 총 객체 수는 4가 출력될 것을 예상
         * -> 결과도 4
         * **/
        Set<String> set = new HashSet<String>();

        //객체 저장
        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBATIS");

        //저장된 객체 수 출력
        int size = set.size();
        System.out.println("총 객체 수: " + size);
    }
}