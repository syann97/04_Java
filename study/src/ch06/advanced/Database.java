package ch06.advanced;

public class Database {
    private static Database database = new Database();

    private String connection = "MySQL";

    //private 접근 권한을 갖는 생성자 선언
    private Database() {
    }

    //public 접근 권한을 갖는 정적 메소드 선언
    public static Database getInstance() {
        return database;
    }

    public String connect() {
        System.out.println(connection + "에 연결합니다.");
        return connection;
    }

    public void close() {
        System.out.println(connection + "을 닫습니다.");
    }

    public String getConnection() {
        return connection;
    }
}
