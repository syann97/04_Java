package ch12.sec08;
import java.util.*;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + "년 " + month + "월 " + day + "일");

        switch(week) {
            case Calendar.MONDAY: System.out.print("월요일"); break;
            case Calendar.TUESDAY: System.out.print("화요일"); break;
            case Calendar.WEDNESDAY: System.out.print("수요일"); break;
            case Calendar.THURSDAY: System.out.print("목요일"); break;
            case Calendar.FRIDAY: System.out.print("금요일"); break;
            case Calendar.SATURDAY: System.out.print("토요일"); break;
            default: System.out.print("일요일");
        }

        int amPm = now.get(Calendar.AM_PM);
        switch(week) {
            case Calendar.AM: System.out.println(" 오전");
            default: System.out.println(" 오후");
        }

        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);
        System.out.println(hour + "시 " + minute + "분 " + second + "초");
    }
}