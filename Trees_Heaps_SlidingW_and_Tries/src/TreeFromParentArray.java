// Optimum way is different and easy PL see it once,
    // Make map<Integer, Node> and the for loop to connect.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TreeFromParentArray{
    static Map<Integer, ArrayList<Integer>> myMap;

    static void helper(Node root){
        ArrayList<Integer> arr = myMap.get(root.data);
        if(arr == null) return;
        if(arr.size() > 0){
            root.left = new Node(arr.get(0));
            helper(root.left);
        }
        if(arr.size() == 2){
            root.right = new Node(arr.get(1));
            helper(root.right);
        }
    }
    public static void main(String[] args){
        int[] arr = {2,0,-1};

        myMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            ArrayList<Integer> temp = myMap.getOrDefault(arr[i], new ArrayList<>());
            temp.add(i);
            myMap.put(arr[i], temp);
        }
        Node root = new Node(myMap.get(-1).get(0));
        helper(root);
        Tree.preOrder(root);
    }
}
