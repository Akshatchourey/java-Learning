import java.util.ArrayList;

// prime no n == (x + y) ans
public class PrimePareTargetSum{
    static void helper(int n, ArrayList<Integer> primes){
        primes.add(2);
        int c, j;
        for(int i=3;i<n-1;i++){
            c = 0; j = 0;
            while(primes.get(j) <= Math.sqrt(i)){
                if(i % primes.get(j) == 0){
                    c++;
                    break;
                }
                j++;
            }
            if(c==0) primes.add(i);
        }
    }
    public static void main(String[] args){
        int n = 14;
        ArrayList<Integer> primes = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        helper(n, primes);
        int x=0, y=primes.size()-1, temp1, temp2;
        while(x <= y){
            temp1 = primes.get(x);
            temp2 = primes.get(y);
            if(temp1 + temp2 == n){
                ans.add(temp1);
                ans.add(temp2);
                break;
            }
            else if(temp1+temp1 == n){
                ans.add(temp1);
                ans.add(temp1);
                break;
            }
            else if(temp1+temp2 > n) y--;
            else x++;
        }
        System.out.println(ans);
    }
}
