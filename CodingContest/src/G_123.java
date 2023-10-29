import java.util.*;

public class G_123{
    static int squares(int n, int x){
        int s = 0, b = 1;
        while(n >= 0){
            if(b == x) return s;
            else if(b > x) break;
            s += b;
            b *= 4;
            n--;
        }
        if(n == -1) return -1;
        b /= 4;
        s -= b;
        if((x-b)%3 == 0) return s+(x-b)/3;
        return 1+s+(x-b)/3;
    }
    static int[] findBots(String[] usernames, int n){
        int[] ans = new int[usernames.length];
        Set<Character> mySet = new HashSet<>(); int i=0, s;
        for(String u:usernames){
            mySet.clear();
            for(int j=0;j<u.length();j+=2) mySet.add(u.charAt(j));
            s = mySet.size();
            if(s==2 || s==3 || s==5 || s==7 || s==11) ans[i] = 1;
            else ans[i] = 0;
            i++;
        }
        return ans;
    }
    static int orSum(int n, int[] A, int m, int[] B){
        Map<Integer, Integer> aa = new HashMap<>(), bb = new HashMap<>();
        int l; String bstr;
        for(int u:A){
            bstr = Integer.toBinaryString(u);
            l = bstr.length();
            for(int i=0;i<l;i++) if(bstr.charAt(i) == '1') aa.put(l-i-1, aa.getOrDefault(l-i-1, 0)+1);
        }
        for(int u:B){
            bstr = Integer.toBinaryString(u);
            l = bstr.length();
            for(int i=0;i<l;i++) if(bstr.charAt(i) == '1') bb.put(l-i-1, bb.getOrDefault(l-i-1, 0)+1);
        }
        int a, b, ans = 0, temp;
        for(int i=0;i<30;i++){
            a = aa.getOrDefault(i, 0); b = bb.getOrDefault(i, 0);
            if(a == 0 && b == 0) continue;
            temp = (a*b) + a*(m-b) + (n-a)*b;
            ans += temp * Math.pow(2, i);
            ans = ans%1000000000;
        }
        return ans;
    }
    public static void main(String[] args) {
        // Q1 Done
//        System.out.println("We can make cube in " + squares(5, 100) + " slices.");
        // Q2 Done
//        System.out.println(Arrays.toString(findBots(new String[]{"foo", "bab"}, 2)));

        // Q3 Not Working
        System.out.println(orSum(3, new int[]{5,7,1},2, new int[]{2,3}));
        // Q4 Not even seen(Really bad).
    }
}
