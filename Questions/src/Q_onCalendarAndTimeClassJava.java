import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.time.format.*;
import java.time.*;
import java.util.HashSet;

public class Q_onCalendarAndTimeClassJava{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Q1
        ArrayList<String> arr = new ArrayList<>();
        for(int i=1; i<=10; i++){
            System.out.printf("Enter name of student %d:- ",i);
            String name = sc.next();
            arr.add(name);
        }
        System.out.println("Printing name of 10 students:- ");
        for(String k:arr){
            System.out.print(k+",");
        }System.out.println(".");

        // Q2
        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        // Q3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+ c.get(Calendar.MINUTE) +":"+c.get(Calendar.SECOND));

        // Q4
        DateTimeFormatter f = DateTimeFormatter.ofPattern("H:m:s");
        LocalTime ld = LocalTime.now();
        String dateInNewFormat = ld.format(f);
        System.out.println(dateInNewFormat);

        // Q5
        HashSet<Integer> asq = new HashSet<>();
        for(int i=0; i<5; i++){
            System.out.print("Try to enter unique no:- ");
            int no = sc.nextInt();
            asq.add(no);
        }
        System.out.println("Printing unique no from HashSet:- ");
        System.out.println(asq);
    }
}
