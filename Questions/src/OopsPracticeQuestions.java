import java.util.Scanner;

class Square{
    int a;
    Scanner sc = new Scanner(System.in);
    public int initializingSize(){
        System.out.println("Enter the size in cm...");
        a = sc.nextInt();
        return a;
    }
    public void area(int a){System.out.println("The area of square is " + a*a);}
    public void perimeter(int a){System.out.println("The perimeter of square is " + 4*a);}
}
class Rectangle{
    int l;
    int b;
    Scanner sc = new Scanner(System.in);
    public void initializingPerimeters(){
        System.out.print("Enter the Length in cm...");
        l = sc.nextInt();
        System.out.print("Enter the Breadth in cm...");
        b = sc.nextInt();
    }
    public void area(int l,int b){System.out.println("The area of rectangle is " + l*b);}
    public void perimeter(int l, int b){System.out.println("The perimeter of square is " + 2*(l+b));}
}
class Circle{
    int r;
    Scanner sc = new Scanner(System.in);
    public void initializingRadius(){
        System.out.print("Enter the Radius in cm...");
        r = sc.nextInt();
    }
    public void area(int r){System.out.println("The area of circle is " + 3.141520*r*r);}
    public void circumference(int r){System.out.println("The Circumference of circle is " + 2*3.141520*r);}
}
class CellPhone{
    public void calling(){
        System.out.println("calling akshat");
    }
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
}
class TommyVecetty{
    public String walk(){return "Tommy is walking...";}
    public String run(){return "Tommy is running...";}
    public String jump(){return "Tommy is jumping...";}
    public String fighting(){return "Tommy is firing...";}
    public String firing(){return "Tommy is firing...";}
}

public class OopsPracticeQuestions{
    public static void main(String[] args){
        CellPhone lanavo = new CellPhone();
        lanavo.calling();
        lanavo.ringing();
        lanavo.vibrating();

        Square one = new Square();
        System.out.println(one.initializingSize());
        one.area(one.a);
        one.perimeter(one.a);

        Rectangle two = new Rectangle();
        two.initializingPerimeters();
        two.area(two.l, two.b);
        two.perimeter(two.l, two.b);

        TommyVecetty character = new TommyVecetty();
        System.out.println(character.walk());
        System.out.println(character.run());
        System.out.println(character.jump());
        System.out.println(character.fighting());
        System.out.println(character.firing());

        Circle third = new Circle();
        third.initializingRadius();
        third.area(third.r);
        third.circumference(third.r);
    }
}