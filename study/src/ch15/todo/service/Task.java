package ch15.todo.service;

import lombok.AllArgsConstructor;
import lombok.Data;


// Comparable : 기본 정렬 기준 설정 인터페이스 (TreeSet에서 사용)
@Data
@AllArgsConstructor
public class Task implements Comparable<Task> {
    private int priority;   // 할 일 우선순위 (1 ~ 5) 1이 높은 것
    private String content; // 할 일 내용

    @Override
    public String toString() {
        return "[우선순위: " + priority + "]" + content;
    }

    // 기본 정렬 기준 설정
    @Override
    public int compareTo(Task other) {
        int priorityCompare = this.priority - other.priority;
        if (priorityCompare != 0) return priorityCompare;   // 양수(자리 바꿈), 음수(유지)
        return this.content.compareTo(other.content);
    }
}
