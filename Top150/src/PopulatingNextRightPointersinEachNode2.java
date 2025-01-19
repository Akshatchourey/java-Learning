import java.util.HashMap;
import java.util.Map;

class RightNode {
    public int val;
    public RightNode left;
    public RightNode right;
    public RightNode next;
    public RightNode() {}
    public RightNode(int _val){val = _val;}
    public RightNode(int _val, RightNode _left, RightNode _right, RightNode _next){
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
public class PopulatingNextRightPointersinEachNode2{
    static Map<Integer, RightNode> myMap;
    static void helper(RightNode root, int h){
        if(root == null) return;
        RightNode temp = myMap.getOrDefault(h, new RightNode());
        temp.next = root;
        myMap.put(h, root);
        helper(root.left, h+1);
        helper(root.right, h+1);
    }
    static RightNode connect(RightNode root){
        myMap = new HashMap<>();
        helper(root,0);
        return root;
    }
    public static void main(String[] args){
    }
}
