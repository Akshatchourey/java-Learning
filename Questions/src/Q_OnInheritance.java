class CircleOne{
    int r;
    public CircleOne(){
        this.r = 5;
    }
    public CircleOne(int no){
        this.r = no;
    }
}
class Cylinder1 extends CircleOne{
    int h;
    public Cylinder1(int no){
        this.h = no;
    }
    public void area(){
        System.out.println(2*3.1415*r*(r+h));
    }
    public void volume(){
        System.out.println(3.1415*r*r*h);
    }
}

class Rectangle1{
    int l; int b;
    public Rectangle1(){
        this.l = 10; this.b = 5;
    }
    public int getL(){
        return l;
    }
    public void setL(int l){
        this.l = l;
    }
    public int getB(){
        return b;
    }
    public void setB(int b){
        this.b = b;
    }

}
class Cuboid extends Rectangle{
    int h;
    public Cuboid(){
        this.h = 2;
    }
    public void area(){
        System.out.println(2*(l*b + b*h + h*l));
    }
    public void volume(){
        System.out.println(l*b*h);
    }
}

public class Q_OnInheritance{
    public static void main(String[] args){
        CircleOne firstCircle = new CircleOne(5);
        Cylinder1 firstCylinder = new Cylinder1(5);
        firstCylinder.area();
        firstCylinder.volume();

        Rectangle1 firstRectangle = new Rectangle1();
        Cuboid firstCuboid = new Cuboid();
        firstCuboid.area();
        firstCuboid.volume();
    }
}
