import java.util.*;

public class BurningTreeFromAnyNode{
    static Map<Node, Node> pm;
    static Node target;
    static Node bfsToMapParents(Node root, int start){
        if(root == null) return null;
        if(root.data == start) target = root;
        pm.put(bfsToMapParents(root.left, start), root);
        pm.put(bfsToMapParents(root.right, start), root);
        return root;
    }
    static int minTimeHelper(){
        int time = 0;
        Queue<Node> myQueue = new LinkedList<>();
        myQueue.add(target); myQueue.add(null);
        ArrayList<Node> vis = new ArrayList<>(); vis.add(target);
        while(myQueue.size() > 1){
            Node A = myQueue.poll();
            if(A == null){
                time++;
                myQueue.add(null);
                continue;
            }
            if(A.left != null && !vis.contains(A.left)){
                vis.add(A.left);
                myQueue.add(A.left);
            }
            if(A.right != null && !vis.contains(A.right)){
                vis.add(A.right);
                myQueue.add(A.right);
            }
            if(pm.containsKey(A) && !vis.contains(pm.get(A))){
                vis.add(pm.get(A));
                myQueue.add(pm.get(A));
            }
        }
        return time;
    }
    public static void main(String[] args){
        // Q-GFG burning from any node.
        Node root = Tree.createTreeUsingArray();
        pm = new HashMap<>();
        bfsToMapParents(root, 5);
        System.out.println("Time taken to burn the tree:- " + minTimeHelper());
    }
}
