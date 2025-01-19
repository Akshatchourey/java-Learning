public class MinimumAbsoluteDifferenceinBST{
    static int[] arr;
    static int ans;
    static void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        arr[0] = arr[1];
        arr[1] = root.val;
        ans = Math.min(Math.abs(arr[1]-arr[0]), ans);
        helper(root.right);
    }
    static int getMinimumDifference(TreeNode root){
        ans = Integer.MAX_VALUE;
        arr = new int[]{0, Integer.MAX_VALUE};
        helper(root);
        return ans;
    }
    public static void main(String[] args){

    }
}
