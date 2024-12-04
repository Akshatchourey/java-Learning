import java.util.HashMap;
import java.util.Map;

class Node{
    public int val;
    public Node left;
    public Node right;
    public Node next;
    public Node() {}
    public Node(int _val){val = _val;}
    public Node(int _val, Node _left, Node _right, Node _next){
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
public class PopulatingNextRightPointersinEachNode2{
    static Map<Integer, Node> myMap;
    static void helper(Node root, int h){
        if(root == null) return;
        Node temp = myMap.getOrDefault(h, new Node());
        temp.next = root;
        myMap.put(h, root);
        helper(root.left, h+1);
        helper(root.right, h+1);
    }
    static Node connect(Node root){
        myMap = new HashMap<>();
        helper(root,0);
        return root;
    }
    public static void main(String[] args){
    }
}
