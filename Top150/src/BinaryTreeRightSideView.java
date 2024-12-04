import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView{
    static List<Integer> arr;
    static void helper(TreeNode root, int h){
        if(root == null) return;
        if(arr.size() == h) arr.add(root.val);
        helper(root.right, h+1);
        helper(root.left, h+1);
    }
    static List<Integer> rightSideView(TreeNode root){
        arr = new ArrayList<Integer>();
        helper(root, 0);
        return arr;
    }
    public static void main(String[] args){
    }
}
