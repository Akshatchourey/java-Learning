public class ValidateBinarySearchTree{
    static boolean helper(TreeNode root,TreeNode min,TreeNode max){
        if(root==null) return true;
        if(min!=null && root.val<=min.val) return false;
        if(max!=null && root.val>=max.val) return false;
        return helper(root.left,min,root) && helper(root.right,root,max);
    }
    static boolean isValidBST(TreeNode root){
        return helper(root,null,null);
    }
    public static void main(String[] args){
    }
}
