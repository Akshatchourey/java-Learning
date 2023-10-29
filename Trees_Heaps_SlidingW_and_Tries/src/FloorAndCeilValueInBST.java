public class FloorAndCeilValueInBST{
    static int key = 25;
    public static void main(String[] args){
        Node root = BSTIntroduction.createTreeUsingArray();
//        m_bruteForce(root);
        FCFunction(root);
        System.out.println("f=" + f + "\nc=" + c);

    }
    static int f = Integer.MIN_VALUE, c = Integer.MAX_VALUE;
    static void m_bruteForce(Node root){
        if(root == null) return;
        m_bruteForce(root.left);
        int value = root.data;
        if(value < key && value > f) f = value;
        else if(value > key && value < c) c = value;
        m_bruteForce(root.right);
    }
    static void FCFunction(Node root){
        Node parent = null;
        Node cur = root;
        int value;
        while(cur != null){
            value = cur.data;
            if(value == key){
                parent = cur;
                break;
            }
            else if(key < value){
                if(value < c) c = value;
                cur = cur.left;
            }
            else{
                if(value > f) f = value;
                cur = cur.right;
            }
        }
        if(parent == null) return;
        FCFunction(parent.left);
        FCFunction(parent.right);
    }
}
