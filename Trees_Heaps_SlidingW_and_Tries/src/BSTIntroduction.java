public class BSTIntroduction{
//    static int[] arr = {8,6,4,-1,-1,-1,16,-1,-1};
    static int[] arr = {8,6,-1,-1,21,15,13,-1,-1,-1,26,-1,-1};
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
//        root = recursiveInsertion(root, 7);
//        root = iterativeInsertion(root, 7);
//        root = deleteNode(root, 6);
        Tree.levelOrder2Tree(root);
//        System.out.println(checkerByIOT(root));
//        System.out.println(checkerByRange(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

    }
    static Node recursiveInsertion(Node root, int key){
        if(root == null) return new Node(key);
        if(key < root.data) root.left = recursiveInsertion(root.left, key);
        else if(key > root.data) root.right = recursiveInsertion(root.right, key);
        return root;
    } // recursive space-> O(h)
    static Node iterativeInsertion(Node root, int key){
        Node newNode = new Node(key);
        Node parent = null;
        Node cur = root;
        while(cur != null){
            parent = cur;
            if(cur.data == key) return root;
            else if(key < cur.data) cur = cur.left;
            else cur = cur.right;
        }
        if(parent == null) root = newNode;
        else if(key < parent.data){
            parent.left = newNode;
        }else{
            parent.right = newNode;
        }
        return root;
    } // iterative space-> O(1)
    static Node immediateSuccessorInInorderT(Node root){
        while(root.left != null) root = root.left;
        return root;
    }
    static Node deleteNode(Node root, int key){
        if(root == null) return null;
        if(key < root.data) root.left = deleteNode(root.left, key);
        else if(key > root.data) root.right = deleteNode(root.right, key);
        else{
            if(root.left == null && root.right == null) return null;
            else if(root.left != null && root.right != null){
                Node s = immediateSuccessorInInorderT(root.right);
                root.data = s.data;
                root.right = deleteNode(root.right, s.data);
            }
            else if(root.left == null) return root.right;
            else return root.left;
        }
        return root;
    }
    static int temp = Integer.MIN_VALUE;
    static boolean checkerByIOT(Node root){
        if(root == null) return true;
        if(!checkerByIOT(root.left)) return false;
        if(root.data > temp) temp = root.data;
        else return false;
        if(!checkerByIOT(root.right)) return false;
        return true;
    } // M-1
    static boolean checkerByRange(Node root, int minR, int maxR){
        if(root == null) return true;
        int d = root.data;
        if(d <= minR || d >= maxR) return false;
        if((root.left != null && root.left.data > d) || !checkerByRange(root.left, minR, d)) return false;
        if((root.right != null && root.right.data < d) || !checkerByRange(root.right, d, maxR)) return false;
        return true;
    } // M-2

    static int helper(Node root, int key){
        int s = -1; int l = -1;
        Node cur = root;
        while(cur != null){
            if(cur.data == key) return key;
            else if(cur.data > key){
                l = cur.data;
                cur = cur.left;
            }
            else{
                s = cur.data;
                cur = cur.right;
            }
        }
        return Math.ceilDiv(s+l, 2);
    }
}
