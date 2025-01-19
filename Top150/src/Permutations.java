import java.util.*;

public class Permutations{
    static void helper(List<List<Integer>> ans, ArrayList<Integer> curr, int[] arr){
        if(curr.size() == arr.length){
            ans.add((List<Integer>)curr.clone());
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 15) continue;
            int temp = arr[i];
            curr.add(temp); arr[i] = 15;
            helper(ans, curr, arr);
            curr.remove(curr.size()-1); arr[i] = temp;
        }
    }
    static List<List<Integer>> permute(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, new ArrayList<>(), arr);
        return ans;
    }
    public static void main(String[] args){
        for(List<Integer> k:permute(new int[]{1,2,3})){
            System.out.println(k);
        }
    }
}
