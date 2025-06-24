package com.compony;

class Singleton{
    private static Singleton single_instance = null;

    private Singleton(){}
    public static Singleton getInstance(){
        if(single_instance == null){
            single_instance = new Singleton();
        }
        return single_instance;
    }

    public void releaseInstance(){
        single_instance = null;
    }

    public void instanceId(){
        System.out.println(this);
    }

}

public class SingletonEx{
    public static void main(String[] args){
        Singleton obj = Singleton.getInstance();
        obj.instanceId();
        obj.releaseInstance();  // instance id will not change without releasing instance.

        Singleton obj2 = Singleton.getInstance();
        obj2.instanceId();
    }
}
