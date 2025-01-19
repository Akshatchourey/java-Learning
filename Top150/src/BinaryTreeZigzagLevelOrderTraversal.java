import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal{
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
    List<List<Integer>> zigzagLevelOrder(TreeNode root){
        ans = new ArrayList<>();
        helper(root, 0);
        for(int i=0;i<ans.size();i++){
            if(i%2 != 0){
                List<Integer> temp = ans.get(i);
                temp.sort(Collections.reverseOrder());
                ans.set(i, temp);
            }
        }
        return ans;
    }
    public static void main(String[] args){
    }
}
