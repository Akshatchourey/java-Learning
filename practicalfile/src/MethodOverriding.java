class Animals {
    void sound() {
        System.out.println("Animals make sounds.");
    }
}
class Dogs extends Animals {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}
public class MethodOverriding{
    public static void main(String[] args){
        Animals animal = new Animals();
        animal.sound();

        Animals dog = new Dogs();
        dog.sound();
    }
}
