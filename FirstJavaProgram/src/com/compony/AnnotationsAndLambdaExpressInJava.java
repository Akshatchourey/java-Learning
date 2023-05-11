package com.compony;

//Interface Anonymous
interface InterfaceAno{
    void meth1(int a);
}
class SingleMethodClass implements InterfaceAno{
    public void print(){
        System.out.println("Testing lambda (forgot the spelling of lamda) by single method class.");
    }
    @Override
    public void meth1(int a){System.out.println("meth1 is running. " + a);}
}
public class AnnotationsAndLambdaExpressInJava{
    public static void main(String[] args){

        // One way with writing class and interface.
        InterfaceAno one = new SingleMethodClass();
        one.meth1(4);

        // another way without writing class
        // Anonymous class
        InterfaceAno two = new InterfaceAno(){
            @Override
            public void meth1(int a){
                System.out.println("without writing class meth1 is running " + a);
            }
        };
        two.meth1(5);

        // Lambda Expression
        InterfaceAno obj = (a)->{
            System.out.println("Running lambda expression " + a);
        };
        obj.meth1(6);
    }
}
