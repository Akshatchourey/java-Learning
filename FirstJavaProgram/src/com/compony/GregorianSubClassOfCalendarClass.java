package com.compony;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.GregorianCalendar;

public class GregorianSubClassOfCalendarClass{
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        GregorianCalendar g = new GregorianCalendar();

        // Time Zone class in java
        System.out.println(TimeZone.getAvailableIDs());
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getDefault());

        // GregorianCalendar class in java
        System.out.println(g.isLeapYear(2012));
        g.roll(Calendar.YEAR, true);
        g.roll(Calendar.MONTH, 2);
        g.roll(Calendar.DAY_OF_WEEK, false);
        System.out.println("Time after up, down and amount methods " + g.getTime());
        System.out.println("The hashcode for this calendar is this  "+ g.hashCode());
    }
}
