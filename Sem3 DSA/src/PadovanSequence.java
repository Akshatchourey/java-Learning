public class PadovanSequence{
    public static void main(String[] args){
        int n = 100000;
        if(n == 0 || n == 1 || n == 2) System.out.println(1);
        int a=1, b=1, c=1, ans=0;
        for(int i=0;i<n-2;i++){
            ans = (a+b)%1000000007;
            a = b;
            b = c;
            c = ans;
        }
        System.out.println(ans);
    }
}
