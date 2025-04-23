package ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");

        // 운영체제 명 출력
        System.out.println(osName);

        // 로그인 사용자 명과 홈 디렉토리 출력
        System.out.println(userName);
        System.out.println(userHome);

        // 시스템의 속성 정보 전체 출력
        Properties props = System.getProperties();
        Set keys = props.keySet();

        for(Object objKey : keys) {
            String key = (String) objKey;
            String value = System.getProperty(key);
            System.out.printf("%-40s: %s\n", key, value);
        }
    }
}
