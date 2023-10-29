public class LCA{
    static int[] arr = {5,2,4,-1,1,7,-1,-1,6,-1,-1,-1,3,-1,-1};
    static int idx = 0;

    static Node createTreeUsingArray(){
        if(arr[idx] == -1) return null;
        Node root = new Node(arr[idx]);
        idx++; root.left = createTreeUsingArray();
        idx++; root.right = createTreeUsingArray();
        return root;
    }
    public static void main(String[] args) {
        Node root = createTreeUsingArray();
//        System.out.println(myLCA(root,4,3));
//        System.out.println(myAncestor);
        System.out.println(sirLCA(root,3,1).data);
    }

    static int myAncestor = -1;
    static boolean myLCA(Node root, int a, int b){
        if(root == null || myAncestor != -1) return false;
        int data = root.data;
        boolean l = myLCA(root.left,a,b);
        boolean r = myLCA(root.right,a,b);
        if((l && r) || ((data == a || data == b) && (l || r))) myAncestor = data;
        if(data == a || data == b) return true;
        else return l||r;
    }
    static Node sirLCA(Node root, int a, int b){
        if(root == null) return null;
        if(root.data == a || root.data == b) return root;
        Node l = sirLCA(root.left,a,b);
        Node r = sirLCA(root.right,a,b);
        if(l == null) return r;
        if(r == null) return l;

        return root;
    }
}
