import java.util.*;

class Node{
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
public class CloneGraph{
    static Node cloneGraph(Node root){
        if(root == null) return null;
        Map<Integer, Node> myMap = new HashMap<>();
        Queue<Node> myQueue = new LinkedList<>();
        Node first = new Node(1);
        myMap.put(1, first);
        myQueue.add(root);

        while(!myQueue.isEmpty()){
            Node curr = myQueue.poll();
            Node cloneCurr = myMap.get(curr.val);
            for(Node k: curr.neighbors){
                if(!myMap.containsKey(k.val)){
                    myMap.put(k.val, new Node(k.val));
                    myQueue.add(k);
                }
                cloneCurr.neighbors.add(myMap.get(k.val));
            }
        }

        return first;
    }
    public static void main(String[] args){
    }
}
