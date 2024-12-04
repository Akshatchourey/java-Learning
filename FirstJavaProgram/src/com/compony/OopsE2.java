package com.compony;
// rewriting code of OopsE1 better version with EmployeeNow class

class EmployeeNew{
    String name;
    int id, years = 1, salary = 30_000;
    public EmployeeNew(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void details(){
        System.out.println("My name is " + name + " and my id is " + id);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int increment(int years){
        if(years <= 3){
            salary += salary*.03; // 3% increment
        }
        else if (years <= 5){
            salary += salary*.05;
        }
        else if(years <= 10){
            salary += salary*.1;
        }
        else{
            salary += salary*.2;
        }
        years += 2;
        return salary;
    }
}

public class OopsE2{
    public static void main(String[] args){
        EmployeeNew akshat = new EmployeeNew(121, "Akshat Chourey");
        EmployeeNew satish = new EmployeeNew(212, "Satish Chourey");

        // Printing details
        akshat.details();
        satish.details();

        satish.setSalary(100000);
        System.out.println(akshat.increment(12));
        System.out.println(satish.increment(3));
    }
}
