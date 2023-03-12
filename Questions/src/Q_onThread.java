
class GoodMorning extends Thread{
    @Override
    public void run(){
        for(int i = 1; i<10; i++){
            System.out.println("Good morning Akshat Chourey.");
        }
    }
}
class Welcome extends Thread{
    @Override
    public void run(){
        try{
            Thread.sleep(200);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        while(true){
            System.out.println("Welcome back home Akshat Chourey.");
        }
    }
}

public class Q_onThread{
    public static void main(String[] args){
        GoodMorning th1 = new GoodMorning();
        Welcome th2 = new Welcome();
//        th1.start(); th2.start();
//        th1.setPriority(Thread.MAX_PRIORITY); th2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(th1.getPriority());
        System.out.println(th2.getPriority());

        System.out.println(Thread.currentThread());
        System.out.println(th1.getState());

        System.out.println(Thread.currentThread());
// Returns the reference to the currently executing thread object.
         System.out.println(Thread.currentThread().getState());
    }
}
