import java.util.ArrayList;
import java.util.HashSet;

public class NoOfNodesDistanceKFromLeaf{
    static int ans;
    static ArrayList<Integer> helper(Node root, int k){
        if(root.left == null && root.right == null){
            if(k == 0) ans++;
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);
            return arr;
        }
        HashSet<Integer> temp = new HashSet<>();
        if(root.left != null){
            ArrayList<Integer> left = helper(root.left, k);
            temp.addAll(left);
        }
        if(root.right != null){
            ArrayList<Integer> right = helper(root.right, k);
            temp.addAll(right);
        }
        for(int l:temp){
            if(l == k){
                ans++;
                break;
            }
        }
        ArrayList<Integer> arr = new ArrayList<>(temp);
        arr.replaceAll(integer -> integer + 1);
        return arr;
    }
    public static void main(String[] args){
        ans = 0;
        Node root = Tree.createTreeUsingArray();
        helper(root, 2);
        System.out.println(ans);
    }
}
