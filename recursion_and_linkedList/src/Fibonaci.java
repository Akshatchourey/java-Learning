public class Fibonaci {
    public static void fibo(int a, int b, int n){
        if(n == 2){
            return ;
        }
        int c = b;b += a;
        System.out.print(b + " ");
        a = c;
        fibo(a, b,n-1);
    }
    public static void main(String[] args) {
        System.out.print("0"+" "+"1"+" ");
        fibo(0,1,7);
    }
}
