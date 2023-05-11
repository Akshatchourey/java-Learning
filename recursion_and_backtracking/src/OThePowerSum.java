public class OThePowerSum {
    public static int fun(int x, int n, int c){
        int a = Math.toIntExact(Math.round(Math.pow(c,n)));
        if(x > a){
            return fun(x,n,c+1) + fun(x-a,n,c+1);
        }
        else if(x == a){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(fun(100,2,1));
    }
}
