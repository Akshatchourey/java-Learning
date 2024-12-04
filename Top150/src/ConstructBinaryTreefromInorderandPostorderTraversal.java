public class ConstructBinaryTreefromInorderandPostorderTraversal{
    static int in;
    static int pos;
    static TreeNode helper(int[] ino, int[] post, int limit){
        if(pos == -1) return null;
        if(ino[in] == limit){
            in--;
            return null;
        }
        TreeNode root = new TreeNode(post[pos--]);
        root.right = helper(ino, post, root.val);
        root.left = helper(ino, post, limit);

        return root;
    }
    static TreeNode buildTree(int[] ino,int[] post){
        pos = in = ino.length-1;
        return helper(ino, post, Integer.MAX_VALUE);
    }
    public static void main(String[] args){
    }
}
