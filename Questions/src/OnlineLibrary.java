import java.util.*;

class Library{
    Scanner sc = new Scanner(System.in);
    ArrayList<String> available_Books = new ArrayList<>();
    ArrayList<String> issued_Books = new ArrayList<>();

    public Library(String name){
        if(name.equals("stef")){
            System.out.print("You are not a premium member press 1 to be a premium_member else press 0:- "); int check = sc.nextInt();
            if(check == 1){
                premiumMember();
            }
            else{
                int f = 0;
                do{
                    System.out.print("What you want to do. press 1.addBook 2.showAvailableBooks 3.showIssuedBooks 4.beAPremiumMember 5.toExit :-");
                    int action = sc.nextInt();
                    if(action == 1){
                        addBook();
                    }
                    else if (action == 2){
                        showAvailableBooks();
                    }else if (action == 3){
                        showIssuedBooks();
                    }else if (action == 4){
                        premiumMember();
                    }else{
                        f = 10;
                    }
                    // System.out.print("Want to exit true/false :-"); f = sc.nextBoolean();
                }while(f == 0);
            }
        }
        else{
            int f = 0;
            do{
                System.out.print("What you want to do. press 1.addBook 2.showAvailableBooks 3.showIssuedBooks 4.issueBook 5.returnBook 6.toExit :-");
                int action = sc.nextInt();
                if(action == 1){
                    addBook();
                }
                else if (action == 2){
                    showAvailableBooks();
                }
                else if (action == 3){
                    showIssuedBooks();
                }
                else if (action == 4){
                    issueBook();
                }else if (action == 5){
                    returnBook();
                }else{
                    f = 100;
                }
            }while(f == 0);
        }
    }
    public void addBook(){
        System.out.print("Name the book you want to add :-");
        String book = sc.next();
        System.out.println("The new book is added to available books named " + book);
        available_Books.add(book);
    }
    public void showAvailableBooks(){
        if(available_Books.isEmpty()){System.out.print("There is no books in the library");}
        for(String k:available_Books){
            System.out.print(k + ", ");
        }System.out.println("");
    }
    public void showIssuedBooks(){
        if(issued_Books.isEmpty()){System.out.print("No books has been issued yet.");}
        for(String is:issued_Books){
            System.out.print(is + ", ");
        }System.out.println("");
    }
    private void issueBook(){
        System.out.print("Name the book you want to issue :-");
        String issueBook = sc.next();
        if(available_Books.contains(issueBook)){
            System.out.println(issueBook + "book has been issued.");
            available_Books.remove(issueBook);
            issued_Books.add(issueBook);
        }else{
            System.out.println("This book is not currently available for issue.");
        }

    }
    private void returnBook(){
        System.out.print("Name the book you want to return :-");
        String returnBook = sc.next();
        issued_Books.remove(returnBook);
        available_Books.add(returnBook);
        System.out.println(returnBook + " book has been returned.");
    }
    public void premiumMember(){
        System.out.println("you are now our premium member.Thx");
        Library akshat = new Library("akshat");
    }
}
public class OnlineLibrary{
    public static void main(String[] args){
        System.out.println("Welcome to my library i hope you enjoy:)");
        Library stef = new Library("stef");
    }
}
