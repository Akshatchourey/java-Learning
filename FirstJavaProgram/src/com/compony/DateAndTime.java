package com.compony;
//import java.time.Year;
import java.util.Date;

public class DateAndTime{
    public static void main(String[] args){
        // class 1
        System.out.println(System.currentTimeMillis());
        System.out.println("'Almost right', years till now is " + System.currentTimeMillis()/1000/3600/24/365);

        // class 2
        Date d = new Date();
        Date d1 = new Date(System.currentTimeMillis());

        Date d2 = new Date(2023, 3, 25);
        System.out.println(d.compareTo(d2));

        System.out.println("Date by constructor date() is:- " + d);
        System.out.println("Date by constructor date(long milliSecond) is:- " + d1);

        System.out.println("\nCurrent millisecond is:- " + d.getSeconds() + " and get by System.currentTimeMillis()");
        System.out.println("\nCurrent time is:- " + d.getTime());
        System.out.println("\nCurrent day is:- " + d.getDay());
        System.out.println("\nCurrent date is:- " + d.getDate());
        System.out.println("\nCurrent year is:- " + d.getYear());

    }
}
