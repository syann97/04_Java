package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> queue = new LinkedList<>();
        queue.offer(new Message("sendMail", "홍길동"));
        queue.offer(new Message("sendSMS", "신용권"));
        queue.offer(new Message("sendKakaotalk", "김자바"));

        String method;
        while (!queue.isEmpty()) {
            Message message = queue.poll();
            if (message.command.equals("sendMail")) method = "메일";
            else if (message.command.equals("sendSMS")) method = "SMS";
            else method = "카카오톡";
            System.out.println(message.to + "님에게 " + method + "을 보냅니다.");
        }
    }
}
