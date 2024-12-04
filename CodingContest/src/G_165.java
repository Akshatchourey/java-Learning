import java.util.*;

public class G_165{
    static String firstWord(int n, String[] dict){
        List<String> arr = new ArrayList<>(Arrays.stream(dict).toList());
        Set<String> ans = new HashSet<>(arr);
        if(dict.length != ans.size()) return "Invalid";
        Collections.sort(arr);
        return arr.get(0);
    }
    static int longestSubarray(int n, int[] arr){
        int ans=-1, size, sum = 0, temp;
        for(int i=0;i<n;i++){
            size = i+1;
            sum += arr[i];
            temp = sum;
            for(int j=0;j<=i;j++){
                if(temp == size) ans = Math.max(ans, size);
                size--;
                temp -= arr[j];
            }
        }
        return ans;
    }
    static int minDifference(int n, int[] arr, int x){
        for(int i=1;i<n;i++){
            for(int j=0;j+i<n;j++){
                if((arr[j]^arr[j+i]) <= x) return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        // Q1 Done
        // Q2 TLE
//        System.out.println(longestSubarray(3, new int[]{2,3,4}));
        // Q3 TLE
        System.out.println(minDifference(5, new int[]{72, 48, 80, 44, 3}, 62));
        // Q4 Not-Seen
    }
}
