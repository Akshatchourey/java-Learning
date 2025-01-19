import java.util.*;

public class Combinations{
    static void helper(List<List<Integer>> ans, ArrayList<Integer> curr, int i, int n, int k){
        if(curr.size() == k){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int j=i+1;j<n-k+curr.size()+2;j++){
            curr.add(j);
            helper(ans, curr, j, n, k);
            curr.remove(curr.size()-1);
        }
    }
    static List<List<Integer>> combine(int n, int k){
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, new ArrayList<>(), 0, n, k);
        return ans;
    }
    public static void main(String[] args){
        for(List<Integer> k:combine(5,3)){
            System.out.println(k);
        }
    }
}
