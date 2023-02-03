package com.compony;
class Employee{
    int no;
    String name;
    int salary = 50000;
    public void details(){
        System.out.println("My name is " + name + " and my platoon no is - " + no);
    }
    public int increment(){
        int final_salary;
        if (name.equals("Akshat Chourey")) {
            final_salary = salary + 50000;
        }else{
            final_salary = salary-5000;
        }
        return final_salary;
    }
    public void setName(){
        name = "papa";
        System.out.println(name);
    }
}
public class OopsE1{
    public static void main(String[] args) {
        Employee akshat = new Employee();
        Employee kriti = new Employee();
        akshat.no = 1; akshat.name = "Akshat Chourey";
        kriti.no = 2; kriti.name = "Kriti Chourey";

        //Printing details of employee akshat
        akshat.details();
        System.out.println(akshat.increment());
        //Printing details of employee kriti
        kriti.details();
        System.out.println(kriti.increment());

        //Set name
        akshat.setName();
        akshat.details();
        //System.out.println(akshat.no + akshat.name);
    }
}
