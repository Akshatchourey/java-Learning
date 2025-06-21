class Parents {
    void display() {
        System.out.println("This is the Parent class method.");
    }
}
class Childs extends Parents {
    void display() {
        System.out.println("This is the Child class method.");
    }
    void callParentMethod() {
        super.display();
    }
}
public class BaseClassMethod{
    public static void main(String[] args){
        Childs child = new Childs();
        child.display();
        child.callParentMethod();
    }
}
