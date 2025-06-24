package com.compony;

enum DayOfWeek{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
public class Enumerator{
    public static void main(String[] args){
        DayOfWeek today = DayOfWeek.MONDAY;
        if (today == DayOfWeek.MONDAY) {
            System.out.println("Today is Monday");
        }
    }
}
