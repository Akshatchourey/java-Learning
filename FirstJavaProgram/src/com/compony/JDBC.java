package com.compony;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

public class JDBC{
    public static void main(String[] args){
        try{
            // This class lodes any string given as input into memory.
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/money", "localhost", "12345akshat");

            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("select * from entry order by SNo desc;");

            int i = 0;
            while(result.next()){
                System.out.print("SNo: " + result.getString("SNo") + " ");
                System.out.print("Date: " + result.getString("Date") + " ");
                System.out.println("Note: " + result.getString("Note"));
            }

            con.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
