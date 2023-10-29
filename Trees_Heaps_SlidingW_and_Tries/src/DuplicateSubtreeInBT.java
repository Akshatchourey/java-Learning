import java.util.HashMap;
import java.util.Map;

public class DuplicateSubtreeInBT{
    static Map<String, Integer> myMap;
    static String helper(Node root){
        if(root == null) return "#";
        if(root.left == null && root.right == null){
            return Integer.toString(root.data);
        }
        String subString = root.data + "," + helper(root.left) + "," + helper(root.right);
        myMap.put(subString, myMap.getOrDefault(subString, 0) + 1);
        return subString;
    }
    public static void main(String[] args){
        Node root = Tree.createTreeUsingArray();
        myMap = new HashMap<>();
        helper(root);
        for(int u: myMap.values()) if(u > 1) System.out.println(1);
        System.out.println("0");
    }
}
