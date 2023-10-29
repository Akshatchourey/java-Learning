import java.util.TreeMap;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;

class Pare{
    int hd; // horizontal distance
    Node node;
    public Pare(int hd, Node root){
        this.hd = hd;
        this.node = root;
    }
}
public class TopAndBottomView{
    static int[] arr = {6,2,-1,3,-1,4,-1,-1,1,-1,5,-1,-1};
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
        topView(root);
        System.out.println("");
        bottomView(root);
    }
    static void topView(Node root){
        Map<Integer, Integer> topMap = new TreeMap<>();
        Queue<Pare> myQueue = new ArrayDeque<>();
        myQueue.add(new Pare(0, root));
        while(myQueue.size() != 0){
            Pare B = myQueue.poll();
            if(!topMap.containsKey(B.hd)){
                topMap.put(B.hd, B.node.data);
            }
            if(B.node.left != null) myQueue.add(new Pare(B.hd-1,B.node.left));
            if(B.node.right != null) myQueue.add(new Pare(B.hd+1,B.node.right));
        }
        for(int u:topMap.values()) System.out.print(u + " ");
    }
    static void bottomView(Node root){
        Map<Integer,Integer> bottomMap = new TreeMap<>();
        Queue<Pare> myQueue = new ArrayDeque<>();
        myQueue.add(new Pare(0,root));
        while(myQueue.size() != 0){
            Pare B = myQueue.poll();
            bottomMap.put(B.hd,B.node.data);
            if(B.node.left != null) myQueue.add(new Pare(B.hd-1,B.node.left));
            if(B.node.right != null) myQueue.add(new Pare(B.hd+1,B.node.right));
        }
        for(int u:bottomMap.values()) System.out.print(u + " ");
    }
}
