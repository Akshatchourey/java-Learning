package com.compony;

class Limit{
    int speedLimit = 50;

    public int getSpeedLimit(){
        return speedLimit;
    }
}
interface Bicycle{
    void applyBreak(int decrement);
    void speedUp(int increment);
}
class GoogleSmartCycle extends Limit implements Bicycle{
    int speed = 7;
    public void applyBreak(int decrement){
        speed -= decrement;
        System.out.println("Now speed is " + speed);
    }
    public void speedUp(int increment){
        speed += increment;
        System.out.println("Now speed is " + speed);
    }
}

public class InterfacesOops{
    public static void main(String[] args){
        GoogleSmartCycle oneBeta = new GoogleSmartCycle();
        oneBeta.applyBreak(5);
        oneBeta.speedUp(16);
        System.out.println(oneBeta.getSpeedLimit());
    }
}
