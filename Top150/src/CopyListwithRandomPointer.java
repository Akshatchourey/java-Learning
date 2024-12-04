import java.util.HashMap;
import java.util.Map;

class CopyNode {
    int val;
    CopyNode next;
    CopyNode random;
    public CopyNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListwithRandomPointer{
    static CopyNode copyRandomList(CopyNode root){
        CopyNode head = root;
        CopyNode parent = new CopyNode(-1);
        Map<CopyNode, CopyNode> myMap = new HashMap<>();
        while(root != null){
            CopyNode curr = new CopyNode(root.val);
            myMap.put(root, curr);
            parent.next = curr;
            parent = curr; root = root.next;
        }
        root = head;
        while(root != null){
            if(root.random != null){
                myMap.get(root).random = myMap.get(root.random);
            }
            root = root.next;
        }
        System.out.println(myMap);
        return myMap.get(head);
    }
    public static void main(String[] args){
        System.out.println();
    }
}
