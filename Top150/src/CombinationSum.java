import java.util.*;

public class CombinationSum{
    static void helper(List<List<Integer>> ans, ArrayList<Integer> curr, int[] arr, int idx, int t){
        if(t<0 || idx == arr.length) return;
        if(t == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        // Inclusion condition
        curr.add(arr[idx]);
        helper(ans, curr, arr, idx, t-arr[idx]);
        curr.remove(curr.size()-1);
        // Exclusion condition
        helper(ans, curr, arr, idx+1, t);
    }
    static List<List<Integer>> combinationSum(int[] arr, int t){
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, new ArrayList<>(), arr, 0, t);
        return ans;
    }
    public static void main(String[] args){
        for(List<Integer> k:combinationSum(new int[]{2,3,5}, 8)){
            System.out.println(k);
        }
    }
}
