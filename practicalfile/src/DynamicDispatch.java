class Vehicle {
    void drive() {
        System.out.println("Vehicles can be driven.");
    }
}
class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Cars are driven on roads.");
    }
}
class Bike extends Vehicle {
    @Override
    void drive() {
        System.out.println("Bikes are ridden on trails.");
    }
}
public class DynamicDispatch{
    public static void main(String[] args){
        Vehicle vehicle;

        vehicle = new Car();
        vehicle.drive();

        vehicle = new Bike();
        vehicle.drive();
    }
}
