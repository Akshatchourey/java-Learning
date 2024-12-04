import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {
    static long ncr(int no, int r){
        // giving incorrect ans, 70,12
       // System.out.println(ncr(69,11));
        double ans = 1;
        while(r != 0){
            ans *= no;
            ans /= r;
            no --; r--;
            if(ans == Math.abs(ans)) ans = ans%1000000007;
        }
        return (long)ans;
    }
    public static void main(String[] args){
        System.out.println("Enter the no of row: ");
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Ans1.2 single line ncr algorithm(This is correct)
        // still gives wrong ans because there is no long long int in java
        /*
        ArrayList<Long> ans = new ArrayList<>();
        ans.add(1L);
        long next, prev = 1L;
        for(int i=1;i< (n/2 + n%2);i++){
            next = prev * (n-i) / i;
            ans.add(next);
            prev = next;
        }
        for(int i=Math.floorDiv(n, 2)-1;i>=0;i--) ans.add(ans.get(i));
        System.out.println(ans);
        */

        // Ans1 ~2n time-complexity This is correct logic but ans is not correct in gfg testcases
        /*
        int r = 0;
        ArrayList<Long> arr = new ArrayList<>();
        for(int i=0;i<Math.ceilDiv(n, 2);i++){
            arr.add(ncr(n-1, r));
            r++;
        }
        for(int i=Math.floorDiv(n, 2)-1;i>=0;i--) arr.add(arr.get(i));
        System.out.println(arr);
        */

        // Ans2 n^2 time-complexity This code works.
        ArrayList<Long> arr = new ArrayList<>();
        ArrayList<Long> temp;
        long mod = 1000000007;
        arr.add(1L);
        for(int i=1;i<n;i++){
            temp = new ArrayList<>();
            temp.add(1L);
            for(int j=1;j<arr.size();j++){
                temp.add(((arr.get(j-1) + arr.get(j))%mod));
            }
            temp.add(1L);
            arr = new ArrayList<>(temp);
        }
        System.out.println(arr);
    }
}
