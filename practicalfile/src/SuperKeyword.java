class Parent {
    Parent(String message) {
        System.out.println("Parent class constructor: " + message);
    }
}
class Child extends Parent {
    Child(String message) {
        super(message);
        System.out.println("Child class constructor.");
    }
}
public class SuperKeyword{
    public static void main(String[] args){
        Child child = new Child("Hello from Parent!");
    }
}
