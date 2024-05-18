import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rough{
    public static int helper(int[] arr, int s){
        Map<Integer, Integer> map = new HashMap<>();
        int i, temp;
        for(i=0;i<s;i++) map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        int ans = map.size();
        while(i < arr.length){
            temp = arr[i-s];
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            map.put(temp, map.get(temp)-1);
            if(map.get(temp) == 0) map.remove(temp);
            ans = Math.max(ans, map.size());
            i++;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        System.out.println(helper(arr, m));
    }
}
