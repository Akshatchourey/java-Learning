public class CountCompleteTreeNodes{
    static int countNodes(TreeNode root){
        if(root == null) return 0;
        if(root.right == null){
            if(root.left == null) return 1;
            return 2;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
    public static void main(String[] args){
    }
}
