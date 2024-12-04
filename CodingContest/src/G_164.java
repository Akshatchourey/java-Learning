import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class G_164{
    static String reachAlice(int d, int x, int y, int k){
        if((d/x) <= (d/y)+k) return "Walk";
        return "Bike";
    }
    static int[] removeOrder(int n, int[] arr, String str){
        int[] ans = new int[n];
        int i = 0, j = arr.length-1;
        Arrays.sort(arr);
        for(int x=0;x<str.length();x++){
            if(str.charAt(x) == '0') ans[x] = arr[i++];
            else ans[x] = arr[j--];
        }
        return ans;
    }
    static long countSubarrays(int n, int[] arr){
        long ans = 0;
        ArrayList<Integer> asq = new ArrayList<>();
        ArrayList<Integer> curr;
        for(int i=0;i<n;i++){
            asq.add(arr[i]);
            curr = new ArrayList<>(asq);
            Collections.sort(curr);
            for(int j=0;j<=i;j++){
                if((curr.get(0) + curr.get(curr.size()-1))%(i-j+1) == 0) ans++;
                curr.remove((Integer) arr[j]);
            }
        }
        return ans;
    }
    static long countSubarrays2(int n, int[] arr){
        long ans = 0;
        ArrayList<Integer> asq = new ArrayList<>();
        ArrayList<Integer> curr;
        for(int i=0;i<n;i++){
            asq.add(arr[i]);
            curr = new ArrayList<>(asq);
            Collections.sort(curr);
            for(int j=0;j<=i;j++){
                if((curr.get(0) + curr.get(curr.size()-1))%(i-j+1) == 0) ans++;
                curr.remove((Integer) arr[j]);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        // Q1 - Done
//        System.out.println(reachAlice(150,3,5,12));
        // Q2 - Done
//        for(int k:removeOrder(4, new int[]{7,5,11,3}, "0110")) System.out.print(k + " ");
        // Q3 - TLE Error
        System.out.println(countSubarrays(5, new int[]{1,2,2,3,2}));
        // Q4 - Not seen
    }
}
