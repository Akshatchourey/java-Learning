import com.sun.source.tree.Tree;

import java.util.ArrayList;

public class KthSmallestElementinaBST{
    static ArrayList<Integer> ans;
    static void helper(TreeNode root, int k){
        if(root == null) return;
        helper(root.left, k);
        ans.add(root.val);
        helper(root.right, k);
    }
    static int kthSmallest(TreeNode root, int k){
        ans = new ArrayList<>();
        helper(root, k);
        return ans.get(k-1);
    }
    public static void main(String[] args){
    }
}
