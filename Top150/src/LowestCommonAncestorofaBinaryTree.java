public class LowestCommonAncestorofaBinaryTree{
    static TreeNode lowestCommonAncestor(TreeNode root, TreeNode a, TreeNode b){
        if(root == null) return null;
        if(root.val == a.val || root.val == b.val) return root;
        TreeNode l = lowestCommonAncestor(root.left,a,b);
        TreeNode r = lowestCommonAncestor(root.right,a,b);
        if(l == null) return r;
        if(r == null) return l;

        return root;
    }
    public static void main(String[] args){
    }
}
