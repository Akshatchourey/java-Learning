//package library;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * The one of the first online library created by akshat. There are some methods and classes mentioned below.
 * @author Akshat Chourey
 * @version 0.2.3
 * @since jan/2023
 * @see <a href="https://docs.oracle.com/en/java/javase/19/docs/api/index.html">Java Docs</a>
 */
interface Data{
    ArrayList<List> books = new ArrayList<>();
    ArrayList<String> member = new ArrayList<>(Collections.singletonList("stef"));
}
class Library implements Data{
    Scanner sc = new Scanner(System.in);  String name;
    public void start(String name){
        int f = 0; this.name = name;
        if(member.contains(name)){
            while(f == 0){
                System.out.print("What you want to do. press 1.addBook 2.showAvailableBooks 3.showIssuedBooks 4.issueBook 5.returnBook 6.toExit :-");
                int action = sc.nextInt();
                switch (action) {
                    case(1) ->addBook();
                    case(2) ->showAvailableBooks();
                    case(3) ->showIssuedBooks();
                    case(4) ->issueBook();
                    case(5) ->returnBook();
                    case(6) -> f = 777;
                }
                System.out.println(" ");
            }
        }
        else{
            System.out.println("You are not a premium member press 4 to be a premium_member.");
            while(f == 0){
                System.out.print("What you want to do. press 1.addBook 2.showAvailableBooks 3.showIssuedBooks 4.beAPremiumMember 5.toExit :-");
                int action = sc.nextInt();
                switch (action) {
                    case(1) ->addBook();
                    case(2) ->showAvailableBooks();
                    case(3) ->showIssuedBooks();
                    case(4) ->{premiumMember(); f = 777;}
                    case (5) -> f = 777;
                }
                System.out.println(" ");
            }
        }
    }
    public void addBook(){
        System.out.print("Name the book you want to add :-"); String book = sc.next();
        System.out.print("Name the author of this book :-"); String author = sc.next();
        System.out.println("The new book is added to the collection --> " + book + " by " + author);
        List<Object> boo = new ArrayList<>();
        boo.add(book); boo.add(author); boo.add(1);
        books.add(boo);
    }
    public void showAvailableBooks(){
        int no = 0;
        System.out.println("BOOK\t\tAUTHOR");
        for (var bo : books){
            if ((int)bo.get(2) == 1){
                System.out.println(bo.get(0) +"\t\t"+ bo.get(1)); no++;
            }
        }
        System.out.println("Total no of available books are = " + no);
        if(no == 0){System.out.println("There is no book available in the library");}
    }
    public void showIssuedBooks(){
        int no = 0;
        System.out.println("BOOK\t\tAUTHOR");
        for (var bo : books) {
            if ((int)bo.get(2) == 0){
                System.out.println(bo.get(0) +"\t\t"+ bo.get(1)); no++;
            }
        }
        System.out.println("Total no of issued books are = " + no);
        if(no == 0){System.out.println("No books has been issued yet.");}
    }
    private void issueBook(){
        System.out.print("Name the book you want to issue :-"); String issueBook = sc.next(); String current;
        for(var bo:books){
            current = (String)bo.get(0);
            if(current.equals(issueBook)){
                if((int)bo.get(2) == 1){
                    bo.set(2,0); bo.add(name);
                    System.out.println(issueBook + " book has been issued to " + name);
                }else{
                    System.out.println("This book is issued to " + bo.get(3) + " or currently not available for issuing.");
                }
                return;
            }
        }
        System.out.println("The book you are trying to issue are not yet added in the collection.");
    }
    private void returnBook(){
        System.out.print("Name the book you want to return :-"); String returnBook = sc.next();  String current;
        for(var bo:books){
            current = (String)bo.get(0);
            if(current.equals(returnBook)){
                if((int)bo.get(2) == 0){
                    bo.set(2,1); bo.remove(3);
                    System.out.println(returnBook + " book has been returned by " + name);
                }else{
                    System.out.println("You have already returned this book.");
                }
                return;
            }
        }
        System.out.println("Book you are returning is not issued.");
    }
    public void premiumMember(){
        System.out.println("Thank you for becoming the premium user of our services. you are now our premium member.");
        member.add(name);
        start(name);
    }
}


public class OnlineLibrary{
    public static void main(String[] args){
        System.out.println("Welcome to my library i hope you enjoy:)");
        Scanner sc = new Scanner(System.in);

        Library obj = new Library();
        obj.start("stef");
        while(true) {
            System.out.print("Do you want to switch user y/n:- "); String f = sc.next();
            if(f.equals("y")){
                System.out.print("user name:- "); String userName = sc.next();
                obj.start(userName);
            }else{
                break;
            }
        }
    }
}
