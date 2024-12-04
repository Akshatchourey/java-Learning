// Very bad code and logic sorry try not to use this, much good logic is out there, see those;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
     }
 }
public class ConstructBinaryTreefromPreorderandInorderTraversal{
    static int i;
    static TreeNode helper(int[] pre, int[] ino){
        int j;
        TreeNode root = new TreeNode(pre[i]);
        for(j=0;j<ino.length;j++) if(ino[j] == pre[i]) break;
        ino[j] = -4000;
        if(j-1 >= 0 && ino[j-1] != -4000){
            i++;
            root.left = helper(pre, ino);
        }if(j+1 < ino.length && ino[j+1] != -4000){
            i++;
            root.right = helper(pre, ino);
        }
        return root;
    }
    static TreeNode buildTree(int[] pre, int[] ino){
        i = 0;
        return helper(pre, ino);
    }
    public static void main(String[] args){

    }
}
