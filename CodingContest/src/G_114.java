import java.util.*;

public class G_114{
    static boolean helper(int n, ArrayList<Integer> asq){
        if(n == 1) return true;
        else if(asq.contains(n)) return false;
        asq.add(n);
        int no = 0; int temp;
        while(n != 0){
            temp = n%10;
            no += temp*temp;
            n /= 10;
        }
        return helper(no, asq);
    }
    static int diffSum(int n,int m,int[] arr){
        Arrays.sort(arr); int x; int ans = 0;
        if(m == n) return 0;
        if(m*2 <= n) x = m;
        else x = n-m;
        for(int i=0;i<x;i++){
            ans += arr[n-i-1];
            ans -= arr[i];
        }
        return ans;
    }
    static long countStrings(String str) {
        long ans = 1; int j = 1;
        for(char u:str.toCharArray()){
            for(char k:str.substring(j).toCharArray()){
                if(u != k) ans++;
            }
            j++;
        }
        return ans;
    }
    static long countStrings2(String str) {
        long ans = 1;
        int[] c = new int[26];
        for(char u:str.toCharArray()) c[u - 'a']++;
        for(int i=0;i<26;i++){
            for(int j=i+1;j<26;j++) ans += (long)c[i]*c[j];
        }
        return ans;
    }
    public static void main(String[] args){
        // Q1 Done
        System.out.println(helper(19, new ArrayList<>()));

        // Q2 Done
        int n = 5; int m = 2;
        int[] arr = {5, 8, 40, 11, 15};
        System.out.println(diffSum(n,m,arr));

        // Q3  logic ---> if first and last char of subString is,
          // diff than only you get diff str after reversing
        System.out.println(countStrings("abcd"));
        System.out.println(countStrings2("abcd"));
    }
}
