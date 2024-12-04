import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal{
    static List<List<Integer>> ans;
    static void helper(TreeNode root, int h){
        if(root == null) return;
        List<Integer> temp;
        if(ans.size() == h){
             temp = new ArrayList<>();
            temp.add(root.val);
            ans.add(temp);
        }else{
            temp = ans.get(h);
            temp.add(root.val);
            ans.set(h, temp);
        }
        helper(root.left, h+1);
        helper(root.right, h+1);
    }
    static List<List<Integer>> levelOrder(TreeNode root){
        ans = new ArrayList<>();
        helper(root, 0);
        return ans;
    }
    public static void main(String[] args){
    }
}
