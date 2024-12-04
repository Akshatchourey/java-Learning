import java.util.Stack;
class BSTIterator{
    static Stack<TreeNode> myStack;
    public BSTIterator(TreeNode root){
        myStack = new Stack<>();
        while(root != null){
            myStack.push(root);
            root = root.left;
        }
    }
    public int next(){
        TreeNode ans = myStack.pop();
        TreeNode root = ans.right;
        while(root != null){
            myStack.push(root);
            root = root.left;
        }
        return ans.val;
    }
    public boolean hasNext(){
        return !myStack.isEmpty();
    }
}

public class BinarySearchTreeIterator{
    public static void main(String[] args){
    }
}
