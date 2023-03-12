import java.util.Scanner;

class DisplayMessage{
    public void display(String toDisplay){
        System.out.println(toDisplay);
    }
}

public class Q_onPackagesAndAccessModifiersQ2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("pl write message:- ");
        DisplayMessage firstMess = new DisplayMessage();
        firstMess.display(sc.nextLine());
    }
}
