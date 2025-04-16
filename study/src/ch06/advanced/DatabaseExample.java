package ch06.advanced;

public class DatabaseExample {
    public static void main(String[] args) {
        Database obj1 = Database.getInstance();

        obj1.connect();
        System.out.println("데이터베이스: " + obj1.getConnection());
        obj1.close();
    }
}
