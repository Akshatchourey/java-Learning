public class FlattenBinaryTreetoLinkedList{
    static void flatten(TreeNode root){
        if(root == null) return;
        TreeNode current = root;
        while(current != null){
            if(current.left != null){
                TreeNode left = current.left;
                while(left.right != null) left = left.right;
                left.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }
    public static void main(String[] args){
    }
}
