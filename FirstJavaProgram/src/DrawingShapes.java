import com.codewithakshat.shape.*;

public class DrawingShapes{
    public static void main(String[] args){
        Sphere ball = new Sphere();
        Rectangle box = new Rectangle();
        Square cube = new Square();
        Cylinder tank = new Cylinder();
        Circle curve = new Circle();
        System.out.println("Printing all the data we had around objects-->Sphere, Rectangle, Square, Cylinder, Circle");
        ball.volume(); ball.totalSurfaceArea();
        System.out.println("Rectangle == selected shape.");
        box.area(); box.perimeter();
        System.out.println("Square == selected shape.");
        cube.area(); cube.perimeter();
        tank.volume(); tank.totalSurfaceAre();
        curve.area(); curve.circumference();
        System.out.println("Thx.");
    }
}
