import java.util.*;

public class Sum3{
    static List<List<Integer>> threeSum(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        Set<List<Integer>> ans = new HashSet<>();
        for(int i=0; i<n; i++){
            int l = i+1, r = n, t, f;
            while(l < r){
                t = -1 * (arr[i] + arr[l]);
                f = Arrays.binarySearch(arr,l+1,r,t);
                if(f > 0){
                    ans.add(Arrays.asList(arr[i], arr[l], t));
                    r = f;
                }
                l++;
            }
        }
        return new ArrayList<>(ans);
    }
    public static void main(String[] args){
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
