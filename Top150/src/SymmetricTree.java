public class SymmetricTree{
    static boolean ans;
    static void helper(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null) return;
        if((root1==null && root2!=null) ||
                (root1!=null && root2==null) || (root1.val != root2.val)){
            ans = false;
            return;
        }
        helper(root1.left, root2.right);
        helper(root1.right, root2.left);
    }
    static boolean isSymmetric(TreeNode root){
        ans = true;
        helper(root.left, root.right);
        return ans;
    }
    public static void main(String[] args){
    }
}
