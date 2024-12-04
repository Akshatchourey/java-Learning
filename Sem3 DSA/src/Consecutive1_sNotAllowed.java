public class Consecutive1_sNotAllowed{
    public static void main(String[] args){
        // a->ans --> new(a)=a+b+c
        // b->ending with 1
        // c->starting with 0 and ending with 1
        int n = 10000;
        long a=2, b=1, c=0, temp;
        for(int i=0;i<n-1;i++){
            a = (a+b+c)%1000000007;
            temp = b;
            b = (b+c)%1000000007;
            c = temp;
        }
        System.out.println(a);
    }
}
