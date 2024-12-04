import com.sun.source.tree.Tree;

public class SumRoottoLeafNumbers{
    static int ans;
    static void helper(TreeNode root, int no){
        if(root == null) return;
        if(root.left == null && root.right == null){
            ans += no*10 + root.val;
        }
        helper(root.left, no*10 + root.val);
        helper(root.right, no*10 + root.val);
    }
    static int sumNumbers(TreeNode root){
        ans = 0;
        helper(root, 0);
        return ans;
    }
    public static void main(String[] args){
    }
}
