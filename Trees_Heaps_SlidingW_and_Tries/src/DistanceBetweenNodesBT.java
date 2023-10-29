public class DistanceBetweenNodesBT{
    static int[] arr = {1,2,3,-1,4,5,-1,6,-1,-1,-1,-1,-1};
//    static int[] arr = {};
    static int idx = 0;
    static Node createTreeUsingArray(){
        if(arr[idx] == -1) return null;
        Node root = new Node(arr[idx]);
        idx++; root.left = createTreeUsingArray();
        idx++; root.right = createTreeUsingArray();
        return root;
    }
    public static void main(String[] args){
        Node root = createTreeUsingArray();
        if(root.left == null && root.right == null) System.out.println(0);
//        if(a == b) System.out.println(0);  if same element then distance is zero
        distance(root, 4,6);
        System.out.println(ans);
    }
    static int ans;
    static int distance(Node root, int a, int b){
        if(root == null) return 0;
        int l = distance(root.left,a,b);
        int r = distance(root.right,a,b);

        if(l != 0 || r != 0){
            if(root.data == a || root.data == b || (l != 0 && r != 0)){
                ans = l+r;
                return 0;
            }
        }
        if(root.data == a || root.data == b) return 1;
        if(l==0 && r==0) return 0;
        return l+r+1;
    }
}
