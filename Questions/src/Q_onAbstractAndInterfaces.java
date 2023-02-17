
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    public void changeNib(){
        System.out.println("Changing nib of fountain pen.");
    }
    public void write(){
        System.out.println("Writing with new fountain pen.");
    }
    public void refill(){
        System.out.println("Refilling the ink of fountain pen.");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    public void jump(){
        System.out.println("Jumping like monkey.");
    }
    public void bite(){
        System.out.println("Biting.");
    }
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void jump(){
        System.out.println("Jumping for athletic practice.");
    }
    public void eat(){
        System.out.println("Eating like human.");
    }
    public void sleep(){
        System.out.println("I am in deep sleep.");
    }
}
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
    public void talk(){
        System.out.println("Talking");
    }
}
class SmartTelephone extends Telephone{
    public void ring(){
        System.out.println("ringing tring...tring...");
    }
    public void lift(){
        System.out.println("Good morning sir, Akshat speaking how can i help you?");
    }
    public void disconnect(){
        System.out.println("Line got disconnected.");
    }
}
interface TVRemote{
    void abc();
    default void simple(){
        System.out.println("12345...");
    }
}
interface SmartTVRemote extends TVRemote{
    default void smart(){
        System.out.println("Hallow Google");
    }
}
class TV implements TVRemote{
    public void abc(){
        System.out.println("Playing youtube.");
    }
}
public class Q_onAbstractAndInterfaces{
    public static void main(String[] args){
        FountainPen pen1 = new FountainPen();
        // pen1.changeNib(); pen1.refill(); pen1.write();

        Human hum1 = new Human();
        // hum1.jump(); hum1.bite(); hum1.eat(); hum1.sleep();
        BasicAnimal p_t_i = new Human();  //Polymorphism through interface.
        Monkey d_m_d_t_a_c = new Human(); //Dynamic method dispatch through abstract class.
        // p_t_i.eat(); p_t_i.sleep();
        // d_m_d_t_a_c.jump(); d_m_d_t_a_c.bite();

        Telephone phone1 = new SmartTelephone();
        // phone1.ring(); phone1.lift(); phone1.talk(); phone1.disconnect();

        TV firstTV = new TV();
        // firstTV.abc(); firstTV.simple();
    }
}
