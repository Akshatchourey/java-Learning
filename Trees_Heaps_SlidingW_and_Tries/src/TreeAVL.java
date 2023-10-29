
class AVLNode{
    int data, height;
    AVLNode left, right;
    AVLNode(int data){
        this.data = data;
        this.height = 1;
    }
}

public class TreeAVL{
    public static void main(String[] args){
        int[] arr = {54, 44, 86, 43, 46, 78, 88,50, 61, 83,89};
        AVLNode root = new AVLNode(arr[0]);
        for(int u:arr) root = insert(root, u);
        int[] del = {46, 86, 88, 61, 89, 78, 54, 83};
        inOrder(root);
        for(int d:del){
            root = deleteNode(root,d);
            System.out.println("\n");
            inOrder(root);
        }
    }
    static void inOrder(AVLNode A){
        if(A == null) return;
        inOrder(A.left);
        System.out.print(A.data + " ");
        inOrder(A.right);
    }
    static int height(AVLNode n){
        if(n == null) return 0;
        return n.height;
    }
    static AVLNode immediateSuccessorInInorderT(AVLNode root){
        while(root.left != null) root = root.left;
        return root;
    }
    static AVLNode leftRotation(AVLNode n){
        AVLNode x = n; AVLNode y = x.right;
        AVLNode yl = y.left;
        y.left = x;
        x.right = yl;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }
    static AVLNode rightRotation(AVLNode n){
        AVLNode x = n; AVLNode y = x.left;
        AVLNode yr = y.right;
        y.right = x;
        x.left = yr;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }
    static AVLNode insert(AVLNode n, int key){
        if(n == null) return new AVLNode(key);
        if(n.data == key) return n;
        else if(key < n.data) n.left = insert(n.left, key);
        else n.right = insert(n.right, key);
        // height and getBalanced
        n.height = 1 + Math.max(height(n.left), height(n.right));
        int b = height(n.left)-height(n.right);

        // 4 cases.
        if(b < -1 && key > n.right.data) return leftRotation(n);
        else if(b > 1 && key < n.left.data) return rightRotation(n);
        else if(b < -1 && key < n.right.data){
            n.right = rightRotation(n.right);
            return leftRotation(n);
        }
        else if(b > 1 && key > n.left.data){
            n.left = leftRotation(n.left);
            return rightRotation(n);
        }
        return n;
    }
    static AVLNode deleteNode(AVLNode root, int key){
        if(root == null) return null;
        if(key < root.data) root.left = deleteNode(root.left, key);
        else if(key > root.data) root.right = deleteNode(root.right, key);
        else{
            if(root.left == null && root.right == null) return null;
            else if(root.left != null && root.right != null){
                AVLNode s = immediateSuccessorInInorderT(root.right);
                root.data = s.data;
                root.right = deleteNode(root.right, s.data);
            }
            else if(root.left == null) return root.right;
            else return root.left;
        }
        // height and getBalanced
        root.height = 1 + Math.max(height(root.left), height(root.right));
        int b = height(root.left)-height(root.right);
        // 4 cases.
        if(b < -1){
            if(root.right == null) System.out.println("wrong");
            AVLNode temp = root.right;
            if(height(temp.left)-height(temp.right) <= 0) return leftRotation(root);
            else{
                root.right = rightRotation(root.right);
                return leftRotation(root);
            }
        }
        else if(b > 1){
            if(root.left == null) System.out.println("wrong");
            AVLNode temp = root.left;
            if(height(temp.left)-height(temp.right) >= 0) return rightRotation(root);
            else{
                root.left = leftRotation(root.left);
                return rightRotation(root);
            }
        }
        return root;
    }
}
