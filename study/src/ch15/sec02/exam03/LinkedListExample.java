package ch15.sec02.exam03;

import ch15.sec02.exam01.Board;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Board> board = new LinkedList<>();

        board.add(new Board("제목1", "내용1", "글쓴이1"));
        board.add(new Board("제목2", "내용2", "글쓴이2"));
        board.add(new Board("제목3", "내용3", "글쓴이3"));
        board.add(new Board("제목4", "내용4", "글쓴이4"));
        board.add(new Board("제목5", "내용5", "글쓴이5"));

        System.out.println("요소의 개수: " + board.size());
        System.out.println("3번째 데이터: " + board.get(2));
        for (int i = 0; i < board.size(); i++) {
            System.out.println(i + "번째 데이터: " + board.get(i));
        }
        System.out.println("인덱스 2에 해당하는 요소 제거: " + board.remove(2));
        System.out.println("인덱스 2에 해당하는 요소 제거: " + board.remove(2));
        for (Board b : board) {
            System.out.println("제목: " + b.getSubject() + ", 내용: " + b.getContent() + ", 글쓴이: " + b.getWriter());
        }
    }
}
