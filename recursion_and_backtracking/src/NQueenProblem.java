import java.util.*;

public class NQueenProblem{
    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    static boolean checker(ArrayList<Integer> ansArray){
        HashSet<Integer> b1 = new HashSet<>(ansArray);
        int l=0; int r=0;
        if(ansArray.size() > b1.size()){
            return true;
        }
        if(ansArray.size()>0){
            int last = ansArray.get(ansArray.size()-1);
            l = last;r = last;  // l=left ans r=right check
        }
        for(int i=ansArray.size()-2;i>=0;i--){
            l -= 1; r += 1;
            if(l == ansArray.get(i) || r == ansArray.get(i)){
                return true;
            }
        }
        return false;
    }
    static void helper(int n, ArrayList<Integer> ansArray){
        // bounding condition
        if(checker(ansArray)){
            return;
        }
        // base condition
        if(ansArray.size() == n){
            ArrayList<Integer> a1 = new ArrayList<>();
            for(int k:ansArray){
                a1.add(k+1);
            }
            if(arr.contains(a1)){
                return;
            }
            arr.add(a1);
            return;
        }
        // recursive call
        for(int i=0;i<n;i++){
            ansArray.add(i);
            helper(n,ansArray);
            ansArray.remove(ansArray.size()-1);
        }
    }
    public static void main(String[] args){
        int n = 8;
        helper(n, new ArrayList<>());
        for(ArrayList<Integer> k:arr){
            System.out.print("[");
            for(int b:k){
                System.out.print(b + " ");
            }
            System.out.print("] ");
        }
//        System.out.println(arr);
//        System.out.println(arr.size());
    }
}
