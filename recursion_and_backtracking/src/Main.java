public class Main {
    public static void fun(int x, int c, int n){
        if(n==0){
            System.out.println(c);
            return ;
        }

        c *= x;
        fun(x, c,n-1);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int x=2;
        fun(x,x*x,5-2);
    }
}