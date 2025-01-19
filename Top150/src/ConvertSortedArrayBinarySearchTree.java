public class ConvertSortedArrayBinarySearchTree{
    static void helper(int[] arr, TreeNode root, int i, int j, boolean side){
        if(j<i) return;
        int mid = (i+j)/2;
        TreeNode node = new TreeNode(arr[mid]);
        if(side) root.left = node;
        else root.right = node;
        helper(arr,node,i,mid-1,true);
        helper(arr,node,mid+1,j,false);
    }
    static TreeNode sortedArrayToBST(int[] arr){
        TreeNode root = new TreeNode();
        helper(arr, root, 0, arr.length-1, true);
        return root.left;
    }
    public static void main(String[] args){
    }
}
