public class MaximumPathSumOfBT{
    static int[] arr = {6,7,1,4,3,-1,-1,-1,2,-1,-1,-1,5,-1,-1};
    static int idx = 0;
    static Node createTreeUsingArray(){
        if(arr[idx] == -1) return null;
        Node root = new Node(arr[idx]);
        idx++; root.left = createTreeUsingArray();
        idx++; root.right = createTreeUsingArray();
        return root;
    }
    static int ans;
    static int maxSum(Node root){ // Integer.MIN_VALUE - 100 gives stack overflow error +ve value
        if(root == null) return -21474836;
        int l = maxSum(root.left);
        int r = maxSum(root.right);
        int data = root.data;
        if(l == -21474836 && r == -21474836){
            ans = Math.max(ans, data);
            return data;
        }
        ans = Math.max(Math.max(ans, l+r+data), Math.max(l, r));
        return Math.max(data, Math.max(l+data, r+data));
    }
    public static void main(String[] args) {
        ans = -21474836;
        System.out.println(Math.max(maxSum(createTreeUsingArray()), ans));
    }
}
