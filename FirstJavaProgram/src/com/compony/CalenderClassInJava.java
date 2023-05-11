package com.compony;

import java.util.Calendar;
import java.util.TimeZone;

public class CalenderClassInJava{
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());

        Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Calcutta"));
        System.out.println(c2.getTimeZone().getID());

        // get(int field)
        System.out.println("For reference " + System.currentTimeMillis());
        System.out.println("Current millisecond is " + c.get(Calendar.MILLISECOND));
        System.out.println("Current second is " + c.get(Calendar.SECOND));
        System.out.println("Current minute is " + c.get(Calendar.MINUTE));
        System.out.println("Current hour of day is " + c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current day of week is " + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current month is giving me one less no every were and getTime is right How? " + c.get(Calendar.MONTH));
        System.out.println("Current year is " + c.get(Calendar.YEAR));

        //add(int field, int amount)
        System.out.println(c.getTime());
        c.add(Calendar.YEAR, 4);
        System.out.println(c.getTime());
        c.add(Calendar.YEAR, -12);
        System.out.println(c.getTime());
        c.add(Calendar.MONTH, 1);
        System.out.println(c.getTime());

        // NO of weeks
        System.out.println(c.getWeeksInWeekYear());

        // NO of max values of the specified calendar field
        System.out.println(c.getMaximum(Calendar.YEAR));
    }
}
