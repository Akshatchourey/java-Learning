abstract class Shape {
    abstract void draw();
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}
public class AbstractExample{
    public static void main(String[] args){
        Shape shape;

        shape = new Circle();
        shape.draw();

        shape = new Rectangle();
        shape.draw();
    }
}
