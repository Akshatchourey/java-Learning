import java.util.*;

public class G_161{
    static long Q1(int n, int[] arr){
        int a=-1,b=1;
        long ans=0;
        for(int k:arr){
            if(k != a){
                a = k;
                b = 1;
            }else b++;
            ans += b;
        }
        return ans;
    }
    static int MinSize(int n, int[] arr){
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for(int k:arr){
            myMap.put(k, myMap.getOrDefault(k, 0)+1);
        }
        int ans = 0, i=0;
        int[] temp = new int[myMap.size()];
        for(int k:myMap.values()) temp[i++] = k;
        Arrays.sort(temp);
        for(i=temp.length-1;i>=0;i--){
            ans = Math.abs(ans-temp[i]);
        }
        return ans;
    }
    public static void main(String[] args){
        // Q1 - -done
        int n=5; int[] arr = {2,2,4,5,5};
        System.out.println(Q1(n, arr));
        // Q2 - Done
        System.out.println(MinSize(16, new int[]{1,8,6,6,6,6,6,6,6,6,6,6,6,7,4,5}));
        // Q3 - Not-seen
        // Q4 - Not-seen
    }
}
