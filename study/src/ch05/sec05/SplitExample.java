package ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

        String[] splits = board.split(",");

        String num = splits[0];
        String title = splits[1];
        String content = splits[2];
        String name = splits[3];

        System.out.println("번호: " + num);
        System.out.println("제목: " + title);
        System.out.println("내용: " + content);
        System.out.println("작성자: " + name);
    }
}
