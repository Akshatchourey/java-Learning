package com.compony;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int rollNo;
    String name;
    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name='" + name + '\'' + '}';
    }

    @Override
    public int compareTo(Student that){
        if(this.rollNo > that.rollNo){
            return 1;
        }
        else{return -1;}
    }
}
public class ComparatorAndComparable{
    public static void main(String[] args){
        Comparator<Integer> byLastNo = new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                if(o1%10 > o2%10){return 1;}
                else{
                    return -1;
                }
            }
        };
        List<Integer> num = new ArrayList<>();
        num.add(25); num.add(26); num.add(2); num.add(1); num.add(7); num.add(12); num.add(6); num.add(70);
        // default -- Collections.sort(num);
        // myLogic sort by last no
        System.out.println("Sorted num by last no:-");
        Collections.sort(num, byLastNo);
        System.out.println(num);

        // Sorting String by length using Comparator
        Comparator<String> byLength = new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                if(o1.length() > o2.length()){return 1;}
                else if(o1.length() < o2.length()){return -1;}
                return 0;
            }
        };
        ArrayList<String> pyramid = new ArrayList<>();
        pyramid.add("alsndfois");
        pyramid.add("alsndsadffois");
        pyramid.add("alsnfis");
        pyramid.add("alsndasdfsadfdsfsffois");
        pyramid.add("alsis");
        Collections.sort(pyramid, byLength);
        System.out.println("\nSorted String by length:-");
        for(String k:pyramid){System.out.println(k);}

        System.out.println("\nReal Pyramid now:-");
        int mid = Math.floorDiv(pyramid.size(), 2)-1;
        for(int i=mid;i>=0;i--){
            pyramid.add(pyramid.get(i));
            pyramid.remove(i);
        }
        for(String k:pyramid){System.out.println(k);}


        // Comparable
        List<Student> schoolClass = new ArrayList<>();
        schoolClass.add(new Student(1, "akshat"));
        schoolClass.add(new Student(5, "Kashvi"));
        schoolClass.add(new Student(3, "Kanika"));
        schoolClass.add(new Student(2, "Shoure"));
        schoolClass.add(new Student(4, "Rohan"));
        schoolClass.add(new Student(6, "Addharsh"));

        for(Student k:schoolClass){System.out.println(k);}
        Collections.sort(schoolClass);
        System.out.println("\nAfter sorting schoolClass by rollNo:-");
        for(Student k:schoolClass){System.out.println(k);}

    }
}
